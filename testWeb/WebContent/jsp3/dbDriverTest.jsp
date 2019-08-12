<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JDBC 연동 테스트</h1>

<%
// DB연결 드라이버 클래스 로딩하기
Class.forName("oracle.jdbc.OracleDriver");
// DB연결하기
Connection con = DriverManager.getConnection(
		"jdbc:oracle:thin:@localhost:1521:orcl", 
		"scott", 
		"tiger");
%>
DB 연결됨!<br>

</body>
</html>











