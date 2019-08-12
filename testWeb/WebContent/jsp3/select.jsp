<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
// DB접속정보
String url = "jdbc:oracle:thin:@localhost:1521:orcl";
String user = "scott";
String password = "tiger";

// 1단계: DB 드라이버 로딩
Class.forName("oracle.jdbc.OracleDriver");
// 2단계: DB연결
Connection con = DriverManager.getConnection(url, user, password);
// 3단계: sql문 준비해서 실행
String sql = "SELECT * FROM member ORDER BY id";
// 커넥션(연결)객체 con으로부터 sql문 실행하는 문장객체 가져오기
//Statement stmt = con.createStatement();
PreparedStatement pstmt = con.prepareStatement(sql);
// 4단계: 실행 select문 -> 결과 rs 저장
//ResultSet rs = stmt.executeQuery(sql);
ResultSet rs = pstmt.executeQuery();
%>

<h1>회원목록조회</h1>

<table border="1">
	<tr>
		<th>아이디</th>
		<th>패스워드</th>
		<th>이름</th>
		<th>가입날짜</th>
	</tr>
	<%
	// 5단계: rs저장결과 -> 화면출력
	while (rs.next()) { // 다음행으로 커서 이동시킴(데이터있으면true/없으면false 리턴)
		String id = rs.getString("id"); // 열이름"id"를 문자열형으로 가져오기
		String passwd = rs.getString("passwd");
		String name = rs.getString("name");
		Timestamp regDate = rs.getTimestamp("reg_date");
		%>
		<tr>
			<td><%=id %></td>
			<td><%=passwd %></td>
			<td><%=name %></td>
			<td><%=regDate %></td>
		</tr>
		<%
	}
	%>
</table>

<%
// 사용의 역순으로 JDBC 객체 닫기
rs.close();
//stmt.close();
pstmt.close();
con.close();
%>

</body>
</html>




