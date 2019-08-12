<%@page import="java.sql.*"%>
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
// post 파라미터 한글처리
request.setCharacterEncoding("utf-8");
// 파라미터값 가져오기
String id = request.getParameter("id");
String passwd = request.getParameter("passwd");
String name = request.getParameter("name");


//DB접속정보
String url = "jdbc:oracle:thin:@localhost:1521:orcl";
String user = "scott";
String password = "tiger";

//1단계: DB 드라이버 로딩
Class.forName("oracle.jdbc.OracleDriver");
//2단계: DB연결
Connection con = DriverManager.getConnection(url, user, password);
//3단계: id에 해당하는 passwd 가져오기
String sql = "SELECT passwd FROM member WHERE id=?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, id);
//4단계: select문 실행 -> rs 가져오기
ResultSet rs = pstmt.executeQuery();
//5단계:
// rs 데이터(행=레코드) 있으면 해당 아이디 있음
//   패스워드비교. 같으면 update실행. "수정성공"
//                 다르면 "패스워드가 다름"
// rs 데이터(행=레코드) 없으면 "해당 아이디 없음"
if (rs.next()) {
	// 해당 아이디 있음
	if (passwd.equals(rs.getString("passwd"))) {
		pstmt.close(); // select문을 가진 pstmt문장객체 닫기
		
		sql = "UPDATE member";
		sql += " SET name = ?";
		sql += " WHERE id = ?";
		
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, id);
		// update문 실행
		pstmt.executeUpdate();
		%>
		회원이름 수정 성공!!<br>
		<%
		
	} else {
		%>패스워드가 다릅니다.<br><%
	}
} else {
	%>해당 아이디가 없습니다.<br><%
}

// jdbc 자원 닫기

rs.close();
pstmt.close();
con.close();
%>
</body>
</html>








