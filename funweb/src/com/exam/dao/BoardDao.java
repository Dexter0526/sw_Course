package com.exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

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
		int num = 0;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			con = DBManager.getConnection();
			// num 컬럼값중에 최대값 구하기. 레코드 없으면 null
			String sql = "SELECT MAX(num) FROM board";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			// rs 레코드값 있으면 num = 최대값 + 1
			//             없으면 num = 1
			if (rs.next()) {
				num = rs.getInt(1) + 1;
			} else {
				num = 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, stmt, rs);
		}
		return num;
	} // nextBoardNum method
	
	
	// 게시글 한개 등록하는 메소드
	public void insertBoard(BoardVO boardVO) {
		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuilder sb = new StringBuilder();
		
		try {
			con = DBManager.getConnection();
			
			sb.append("INSERT INTO board (num, username, passwd, subject, content, filename, readcount, ip, reg_date, re_ref, re_lev, re_seq) ");
			sb.append(" VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setInt(1, boardVO.getNum());
			pstmt.setString(2, boardVO.getUsername());
			pstmt.setString(3, boardVO.getPasswd());
			pstmt.setString(4, boardVO.getSubject());
			pstmt.setString(5, boardVO.getContent());
			pstmt.setString(6, boardVO.getFilename());
			pstmt.setInt(7, boardVO.getReadcount());
			pstmt.setString(8, boardVO.getIp());
			pstmt.setTimestamp(9, boardVO.getRegDate());
			pstmt.setInt(10, boardVO.getRe_ref());
			pstmt.setInt(11, boardVO.getRe_lev());
			pstmt.setInt(12, boardVO.getRe_seq());
			// 실행
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt);
		}
	} // insertBoard method
	
	
	
	
	
}
