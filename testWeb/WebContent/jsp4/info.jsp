<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 조회</title>
</head>
<body>
<%
// 세션값 가져오기
String id = (String) session.getAttribute("id");
String name = (String) session.getAttribute("name");
// 세션값 없으면 loginForm.jsp 이동
if (id == null) {
	response.sendRedirect("loginForm.jsp");
	return;
}
%>

<%
//DB접속정보
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "scott";
String password = "tiger";

//1단계: DB 드라이버 로딩
Class.forName("oracle.jdbc.OracleDriver");
//2단계: DB연결
Connection con = DriverManager.getConnection(url, user, password);
//3단계: sql문 준비
String sql = "SELECT * FROM member WHERE id = ?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, id);
//4단계: sql문 실행 -> rs 생성
ResultSet rs = pstmt.executeQuery();

// 변수 선언
String passwd = "";
String age = "";
String gender = "";
String email = "";
Timestamp regDate = null;

if (rs.next()) {
	passwd = rs.getString("passwd");
	age = rs.getString("age");
	gender = rs.getString("gender");
	email = rs.getString("email");
	regDate = rs.getTimestamp("reg_date");
}
%>

<h1>회원정보 조회</h1>

아이디: <%=id %><br>
패스워드: <%=passwd %><br>
이름: <%=name %><br>
나이: <%=(age == null) ? "" : age %><br>
성별: <%=(gender == null) ? "" : gender %><br>
이메일: <%=(email == null) ? "" : email %><br>
가입날짜: <%=regDate %><br>
<br>
<a href="main.jsp">메인화면으로 가기</a>


<%
// JDBC 자원닫기
rs.close();
pstmt.close();
con.close();
%>

</body>
</html>



