<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정</title>
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
String age = "";
String email = "";
String gender = "";

if (rs.next()) {
	age = rs.getString("age");
	email = rs.getString("email");
	
	if (rs.getString("gender") != null) {
		gender = rs.getString("gender");
	}
}
%>

<h1>회원정보 수정</h1>

<form action="updateProcess.jsp" method="post">
	아이디: <input type="text" name="id" value="<%=id %>" <%--readonly--%> disabled /><br>
	패스워드: <input type="password" name="passwd" /><br>
	이름: <input type="text" name="name" value="<%=name %>" /><br>
	나이: <input type="text" name="age" value="<%=(age == null) ? "" : age %>"/><br>
	성별: <input type="radio" name="gender" value="남" 
	      <%=(gender.equals("남")) ? "checked" : "" %> />남자
	      <input type="radio" name="gender" value="여"
	      <%=(gender.equals("여")) ? "checked" : "" %> />여자<br>
	이메일: <input type="email" name="email" value="<%=(email == null) ? "" : email %>"><br>
	<button type="submit">수정하기</button>
</form>
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




