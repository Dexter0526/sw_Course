package com.exam;

import java.sql.*;

public class Ex4 {

	public static void main(String[] args) {
		// DB접속정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 1단계: DB 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			// 2단계: DB연결
			con = DriverManager.getConnection(url, user, password);
			// 3단계: sql문 준비해서 실행
			String sql = "SELECT * FROM member ORDER BY id";
			// 커넥션(연결)객체 con으로부터 sql문 실행하는 문장객체 가져오기
			//Statement stmt = con.createStatement();
			pstmt = con.prepareStatement(sql);
			// 4단계: 실행 select문 -> 결과 rs 저장
			//ResultSet rs = stmt.executeQuery(sql);
			rs = pstmt.executeQuery();
			
			// 5단계: rs저장결과 -> 화면출력
			while (rs.next()) { // 다음행으로 커서 이동시킴(데이터있으면true/없으면false 리턴)
				String id = rs.getString("id"); // 열이름"id"를 문자열형으로 가져오기
				String passwd = rs.getString("passwd");
				String name = rs.getString("name");
				Timestamp regDate = rs.getTimestamp("reg_date");
				
				System.out.print(id);
				System.out.print("\t" + passwd);
				System.out.print("\t" + name);
				System.out.println("\t" + regDate);
			}
		} catch (Exception e) {
			//e.printStackTrace();
			String message = e.getMessage();
			System.out.println(message);
		} finally {
			try {
				// 사용의 역순으로 JDBC 객체 닫기
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	} // main method

}
