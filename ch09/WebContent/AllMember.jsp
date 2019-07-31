<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:admin";
	String uid = "admin";
	String pass = "0000";
	String sql = "select * from member";
	%>

	<table width="800" border="1">
		<tr>
			<th>이름</th>
			<th>암호</th>
			<th>이메일</th>
			<th>전화번호</th>
			<th>권한(1:관리자, 0:일반회원)</th>
		</tr>
		<%
			try {
				System.out.print("test---------------------1");
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.print("test---------------------2");
				conn = DriverManager.getConnection(url, uid, pass);
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);

				while (rs.next()) {
					out.println("<tr>");
					out.println("<td>" + rs.getString(1) + "</td>");
					out.println("<td>" + rs.getString("pwd") + "</td>");
					out.println("<td>" + rs.getString("email") + "</td>");
					out.println("<td>" + rs.getString("phone") + "</td>");
					out.println("<td>" + rs.getInt("admin") + "</td>");
					out.println("</tr>");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs != null)
						rs.close();
					if (stmt != null)
						stmt.close();
					if (conn != null)
						conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		%>
		<tr>
			<td colspan = "6" align = "right">	<a href = "addMemberForm.jsp"> 회원 등록하러 가기</a></td>
		</tr> 
	</table>


</body>
</html>