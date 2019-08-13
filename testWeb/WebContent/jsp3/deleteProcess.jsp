<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
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
<%
	request.setCharacterEncoding("utf-8");

String id = request.getParameter("id");
String passwd = request.getParameter("passwd");

//DB접속정보
String url = "jdbc:oracle:thin:@localhost:1521:orcl";
String user = "scott";
String password = "tiger";

//1단계: DB 드라이버 로딩
Class.forName("oracle.jdbc.OracleDriver");

//2단계: DB연결
Connection con = DriverManager.getConnection(url, user, password);

//3단계: sql문 준비해서 실행
String sql = "SELECT passwd FROM member where id = ?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, id);

//4단계 : sql 문 실행
ResultSet rs = pstmt.executeQuery();

//5단계 : rs데이터 있으면 아이디 있음
//		패스워드 비교 맞으면 delete수행, 삭제성공
//		틀리면 패스워드 틀림
//		없으면 아이디 없음
if(rs.next()){
	
}else{
	
}
%>
</body>
</html>