<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 회원목록</title>
</head>
<body>

<%
// 세션값 가져오기
String id = (String) session.getAttribute("id");
// 세션값 id가 없거나(null) 또는 admin이 아니면 main.jsp로 이동
if (id == null || !id.equals("admin")) {
	response.sendRedirect("main.jsp");
	return;
}
%>

<% // DB연결작업
//DB접속정보
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "scott";
String password = "tiger";

//1단계: DB 드라이버 로딩
Class.forName("oracle.jdbc.OracleDriver");
//2단계: DB연결
Connection con = DriverManager.getConnection(url, user, password);
//3단계: sql문 준비
String sql = "SELECT * FROM member ORDER BY id ASC";
PreparedStatement pstmt = con.prepareStatement(sql);
//4단계: sql문 실행 -> rs 생성
ResultSet rs = pstmt.executeQuery();
%>

<h1>전체 회원목록</h1>

<table border="1">
	<tr>
		<th>아이디</th>
		<th>패스워드</th>
		<th>이름</th>
		<th>성별</th>
		<th>나이</th>
		<th>이메일</th>
		<th>가입일자</th>
	</tr>
	<%
	while (rs.next()) {
		String userId = rs.getString("id");
		String passwd = rs.getString("passwd");
		String name = rs.getString("name");
		String gender = rs.getString("gender");
		String age = rs.getString("age");
		String email = rs.getString("email");
		String regDate = rs.getString("reg_date");
		%>
		<tr>
			<td><%=userId %></td>
			<td><%=passwd %></td>
			<td><%=name %></td>
			<td><%=gender %></td>
			<td><%=age %></td>
			<td><%=email %></td>
			<td><%=regDate %></td>
		</tr>
		<%
	} // while
	%>
</table>

<a href="main.jsp">메인화면으로 가기</a>

<%
// JDBC 자원 닫기
rs.close();
pstmt.close();
con.close();
%>

</body>
</html>




