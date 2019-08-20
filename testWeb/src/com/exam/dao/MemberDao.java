package com.exam.dao;

import java.sql.*;

import com.exam.vo.MemberVO;

public class MemberDao {

	private static MemberDao instance = new MemberDao();

	public static MemberDao getInstance() {
		return instance;
	}
	
	private MemberDao() {
	}

	public int insertMember(MemberVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		
		try {
			con = DBManager.getConnection();
			// 3단계: sql문 준비
			String sql = "INSERT INTO member (id,passwd,name,age,gender,email,reg_date) ";
			sql += " VALUES (?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPasswd());
			pstmt.setString(3, vo.getName());
			pstmt.setInt(4, vo.getAge());
			pstmt.setString(5, vo.getGender());
			pstmt.setString(6, vo.getEmail());
			pstmt.setTimestamp(7, vo.getRegDate());
			// 4단계: sql문 실행
			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt);
		}
		return rowCount;
	} // insertMember method
	
	
	public MemberVO userCheck(String id, String passwd) {
		//int check = -1; // -1 아이디 불일치. 0 패스워드 불일치. 1 일치함
		MemberVO memberVO = null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DBManager.getConnection();
			
			//3단계: sql문 준비
			String sql = "SELECT * FROM member WHERE id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			//4단계: sql문 실행
			rs = pstmt.executeQuery();
			//5단계: rs 데이터 사용

			if (rs.next()) { 
				// 아이디 있음
				if (passwd.equals(rs.getString("passwd"))) {
					memberVO = new MemberVO();
					
					memberVO.setId(rs.getString("id"));
					memberVO.setPasswd(rs.getString("passwd"));
					memberVO.setName(rs.getString("name"));
					
				} else {
					memberVO = null;
				}
			} else { // 아이디 없음
				memberVO = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		return memberVO;
	}
	
	
	

}
