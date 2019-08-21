<%@page import="com.exam.vo.MemberVO"%>
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
MemberVO loginMember = (MemberVO) session.getAttribute("loginMember");

// 세션값 없으면 loginForm.jsp 이동
if (loginMember == null) {
	response.sendRedirect("loginForm.jsp");
	return;
}
%>

<h1>회원정보 조회</h1>

아이디: <%=loginMember.getId() %><br>
패스워드: <%=loginMember.getPasswd() %><br>
이름: <%=loginMember.getName() %><br>
나이: <%=(loginMember.getAge() == null) ? "" : loginMember.getAge() %><br>
성별: <%=(loginMember.getGender() == null) ? "" : loginMember.getGender() %><br>
이메일: <%=(loginMember.getEmail() == null) ? "" : loginMember.getEmail() %><br>
가입날짜: <%=loginMember.getRegDate() %><br>
<br>
<a href="main.jsp">메인화면으로 가기</a>

</body>
</html>



