<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
	<%! 
	Connection conn = null;
	PreparedStatement pstmt = null;
	String url = "jdbc:oracle:thin:@localhost:1521:admin";
	String uid = "admin";
	String pass = "0000";
	String sql = "insert into member values(?, ?, ?, ?, ?)";
	%>
	
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String pwd = request.getParameter("pwd");
	String email = request.getParameter("email");
	String phone = request.getParameter("phone");
	String admin = request.getParameter("admin");
	
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.print("test---------------------3");
	conn = DriverManager.getConnection(url, uid, pass);
	System.out.print("test---------------------4");
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, name);
	pstmt.setString(3, pwd);
	pstmt.setString(4, email);
	pstmt.setString(5, phone);
	pstmt.setInt(6, Integer.parseInt(admin));
	%>
	<script>
		alert("회원가입 성공");
		location.href = "AllMember.jsp";
	</script>
	<%
	} catch (Exception e) {
		e.printStackTrace();
		out.print("<script> alert('회원 가입 실패!'); </script>");
		
		} finally {
		try {
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		%>
		<h3> 회원 가입 성공 </h3>
		<a href="AllMember.jsp"> 회원 전체 목록 보기 </a>
</body>
</html>