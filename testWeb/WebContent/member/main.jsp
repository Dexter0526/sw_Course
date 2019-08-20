<%@page import="com.exam.vo.MemberVO"%>
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
MemberVO memberVO = (MemberVO) session.getAttribute("memberVO");
// 세션값 없으면 loginForm.jsp 이동
if (memberVO == null) {
	response.sendRedirect("loginForm.jsp");
	return;
}
%>

<h1>메인페이지</h1>

<%=memberVO.getName() %>(<%=memberVO.getId() %>)님 로그인 하셨습니다.<br>
<button type="button" onclick="location.href='logout.jsp';">로그아웃</button>
<br>
<a href="info.jsp">회원정보 조회</a><br>
<a href="update.jsp">회원정보 수정</a><br>
<a href="delete.jsp">회원정보 삭제</a><br>

<%
// 위에 코드에서 세션값 없을때 redirect 후 return문 처리했으므로
// 아래 자바코드는 null이 아닐때만 실행됨.
if (memberVO.getId().equals("admin")) {
	%>
	<a href="list.jsp">전체 회원목록</a><br>
	<%
}
%>


</body>
</html>



