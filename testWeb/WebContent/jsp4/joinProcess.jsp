<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 한글처리
request.setCharacterEncoding("utf-8");

String id = request.getParameter("id");
String passwd = request.getParameter("passwd");
String name = request.getParameter("name");
String gender = request.getParameter("gender");
String email = request.getParameter("email");

// 나이 입력은 텍스트 상자이므로 null이 아닌 빈문자열로 넘어옴
String strAge = request.getParameter("age");
int age = 0;
if(strAge != null && !strAge.equals("")){
	age = Integer.parseInt(strAge);
}
Timestamp regDate = new Timestamp(System.currentTimeMillis());

//DB접속정보
String url = "jdbc:oracle:thin:@localhost:1521:orcl";
String user = "scott";
String password = "tiger";

//1단계: DB 드라이버 로딩
Class.forName("oracle.jdbc.OracleDriver");
//2단계: DB연결
Connection con = DriverManager.getConnection(url, user, password);
//3단계: sql문 준비해서 실행
String sql = "insert into member";
sql += " values(?, ?, ?, ?, ?, ?, ?)";
//4단계
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, id);
pstmt.setString(2, passwd);
pstmt.setString(3, name);
pstmt.setTimestamp(4, regDate);
pstmt.setInt(5, age);
pstmt.setString(6, gender);
pstmt.setString(7, email);
pstmt.executeUpdate();

%>
<script>
alert('회원가입 성공');
location.href = 'loginForm.jsp';
</script>
<%
// JDBC 객체 닫기
//stmt.close();
pstmt.close();

con.close();
%>
