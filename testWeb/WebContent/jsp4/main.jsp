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
// 세션값 가져오기
String id = (String) session.getAttribute("id");
String name = (String) session.getAttribute("name");
// 세션값 없으면 loginForm.jsp 이동
if (id == null) {
	response.sendRedirect("loginForm.jsp");
	return;
}
%>

<h1>메인페이지</h1>

<%=name %>(<%=id %>)님 로그인 하셨습니다.<br>
<button type="button" onclick="location.href='logout.jsp';">로그아웃</button>

<a href="">회원정보조회</a><br>



</body>
</html>



