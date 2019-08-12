<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 처리결과</title>
</head>
<body>

<%
// post 파라미터값 한글처리
request.setCharacterEncoding("utf-8");
// 사용자 입력 파라미터값 가져오기
String id = request.getParameter("id");
String passwd = request.getParameter("passwd");
String name = request.getParameter("name");
// 현재 시스템 날짜 가져오기
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
String sql = "";
// sql = "INSERT INTO member (id, passwd, name)";
// sql += " VALUES ('" + id + "', '" + passwd + "', '" + name + "')";

sql = "INSERT INTO member (id, passwd, name, reg_date)";
sql += " VALUES (?, ?, ?, ?)";

//커넥션(연결)객체 con으로부터 sql문 실행하는 문장객체 가져오기
//Statement stmt = con.createStatement();
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, id);         // 첫번째 물음표
pstmt.setString(2, passwd);     // 두번째 물음표
pstmt.setString(3, name);       // 세번째 물음표
pstmt.setTimestamp(4, regDate); // 네번째 물음표

//4단계: 실행 insert문
//stmt.executeUpdate(sql);
pstmt.executeUpdate();
%>

<h1>회원가입 처리결과</h1>
회원가입성공!<br>


<%
// JDBC 객체 닫기
//stmt.close();
pstmt.close();

con.close();
%>


</body>
</html>







