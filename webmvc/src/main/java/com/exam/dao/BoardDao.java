package com.exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.exam.dao.mapper.BoardMapper;
import com.exam.dao.mapper.MemberMapper;
import com.exam.vo.BoardVO;

public class BoardDao {

	private static BoardDao instance = new BoardDao();

	public static BoardDao getInstance() {
		return instance;
	}

	private BoardDao() {
	}

	// insert할 레코드의 번호 생성 메소드
	public int nextBoardNum() {
		// Connection 가져오기
		try (SqlSession sqlSession = DBManager.getSqlSessionFactory().openSession()) {
			// 인터페이스를 구현한 Mapper 프록시 객체를 만들어서 리턴함
			BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
			int bnum = mapper.nextBoardNum();
			return bnum;
		}
		// try 블록이 끝나면 SqlSession 변수의 close() 메소드 자동호출함.
	} // nextBoardNum method
	
	

	// 게시글 한개 등록하는 메소드
	public void insertBoard(BoardVO boardVO) {
		// Connection 가져오기
		try (SqlSession sqlSession = DBManager.getSqlSessionFactory().openSession()) {
			BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
			mapper.insertBoard(boardVO);
			sqlSession.commit();
		}
	} // insertBoard method
	
	
	
	public List<BoardVO> getBoards(int startRow, int pageSize, String search) {
		// Connection 가져오기
		try (SqlSession sqlSession = DBManager.getSqlSessionFactory().openSession()) {
			BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
			return mapper.getBoards(startRow, pageSize, search);
		}
	} // getBoards method

	

	public int getBoardCount(String search) {
		try (SqlSession sqlSession = DBManager.getSqlSessionFactory().openSession()) {
			BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
			return mapper.getBoardCount(search);
		}
	} // getBoardCount method
	
	

	// 특정 레코드의 조회수를 1 증가시키는 메소드
	public void updateReadcount(int num) {
		try (SqlSession sqlSession = DBManager.getSqlSessionFactory().openSession()) {
			BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
			mapper.updateReadcount(num);
			sqlSession.commit();
		}
	} // updateReadcount method

	
	
	// 글 한개를 가져오는 메소드
	public BoardVO getBoard(int num) {
		try (SqlSession sqlSession = DBManager.getSqlSessionFactory().openSession()) {
			return sqlSession.getMapper(BoardMapper.class).getBoard(num);
		}
	} // getBoard method
	
	

	// 게시글 패스워드비교(로그인 안한 사용자가 수행함)
	public boolean isPasswdEqual(int num, String passwd) {
		System.out.println("num : " + num + ", passwd : " + passwd);

		boolean result = false;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		StringBuilder sb = new StringBuilder();
		sb.append("SELECT COUNT(*) ");
		sb.append("FROM board ");
		sb.append("WHERE num = ? ");
		sb.append("AND passwd = ? ");

		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setInt(1, num);
			pstmt.setString(2, passwd);
			// 실행
			rs = pstmt.executeQuery();

			rs.next(); // 커서 내리기

			int count = rs.getInt(1); // 카운트값 가져오기
			if (count == 1) {
				result = true; // 게시글 패스워드 같음
			} else { // count == 0
				result = false; // 게시글 패스워드 다름
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		return result;
	} // isPasswdEqual method

	// 게시글 수정하기 메소드
	public void updateBoard(BoardVO boardVO) {
		Connection con = null;
		PreparedStatement pstmt = null;

		String sql = "";
		sql = "UPDATE jspdb.board ";
		sql += "SET subject = ?, content = ? ";
		sql += "WHERE num = ? ";

		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, boardVO.getSubject());
			pstmt.setString(2, boardVO.getContent());
			pstmt.setInt(3, boardVO.getNum());
			// 실행
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt);
		}
	} // updateBoard method

	// 글번호에 해당하는 글 한개 삭제하기 메소드
	public void deleteBoard(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBManager.getConnection();
			String sql = "DELETE FROM jspdb.board WHERE num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			// 실행
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt);
		}
	} // deleteBoard method

	/*
	 * num subject reRef reLev [reSeq]
	 * ====================================================== 6 주글3 6 0 0 4 주글2 4 0
	 * 0 5 ㄴ답글2 4 1 1 1 주글1 1 0 0 [7] ㄴ답글2 1 1 1 2 ㄴ답글1 1 1 1+1=2 3 ㄴ답글1_1 1 2 2+1=3
	 * 
	 */
	// 답글쓰기 메소드 (update 이후 insert)
	// 트랜잭션 처리가 요구됨(안전하게 처리하려는 목적)
	public void reInsertBoard(BoardVO boardVO) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "";

		try {
			con = DBManager.getConnection();
			con.setAutoCommit(false); // 기본값은 true

			// 같은 글그룹에서의 답글순서(re_seq) 재배치
			// 조건 re_ref같은그룹 re_seq 큰값은 re_seq+1
			sql = "UPDATE jspdb.board ";
			sql += "SET re_seq = re_seq + 1 ";
			sql += "WHERE re_ref = ? ";
			sql += "AND re_seq > ? ";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, boardVO.getReRef());
			pstmt.setInt(2, boardVO.getReSeq());
			// 실행
			pstmt.executeUpdate(); // update문 실행

			// 기존 update문 가진 pstmt 닫기
			pstmt.close();

			// 답글 insert re_ref그대로 re_lev+1 re_seq+1
			sql = "INSERT INTO jspdb.board (num, username, passwd, subject, content, readcount, ip, reg_date, re_ref, re_lev, re_seq) ";
			sql += " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, boardVO.getNum());
			pstmt.setString(2, boardVO.getUsername());
			pstmt.setString(3, boardVO.getPasswd());
			pstmt.setString(4, boardVO.getSubject());
			pstmt.setString(5, boardVO.getContent());
			pstmt.setInt(6, boardVO.getReadcount()); // 조회수
			pstmt.setString(7, boardVO.getIp());
			pstmt.setTimestamp(8, boardVO.getRegDate());
			pstmt.setInt(9, boardVO.getReRef()); // 그대로
			pstmt.setInt(10, boardVO.getReLev() + 1); // re_lev+1
			pstmt.setInt(11, boardVO.getReSeq() + 1); // re_seq+1
			// 실행
			pstmt.executeUpdate(); // insert문 실행

			// commit 실행
			con.commit();

			// 기본설정인 auto commit으로 설정 되돌리기
			con.setAutoCommit(true);

		} catch (Exception e) {
			e.printStackTrace();
			try {
				con.rollback(); // 실행중 예외발생 시 롤백처리
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			DBManager.close(con, pstmt);
		}
	} // reInsertBoard method

}
