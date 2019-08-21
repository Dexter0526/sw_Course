<%@page import="com.exam.vo.MemberVO"%>
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
MemberVO loginMember = (MemberVO) session.getAttribute("loginMember");

// 세션값 없으면 loginForm.jsp 이동
if (loginMember == null) {
	response.sendRedirect("loginForm.jsp");
	return;
}
%>

<h1>회원정보 수정</h1>

<form action="updateProcess.jsp" method="post">
	아이디: <input type="text" name="id" value="<%=loginMember.getId() %>" readonly <%--disabled--%> /><br>
	패스워드: <input type="password" name="passwd" /><br>
	이름: <input type="text" name="name" value="<%=loginMember.getName() %>" /><br>
	나이: <input type="text" name="age" value="<%=(loginMember.getAge() == null) ? "" : loginMember.getAge() %>"/><br>
	성별: <input type="radio" name="gender" value="남" 
	      <%=(loginMember.getGender() != null && loginMember.getGender().equals("남")) ? "checked" : "" %> />남자
	      <input type="radio" name="gender" value="여"
	      <%=(loginMember.getGender() != null && loginMember.getGender().equals("여")) ? "checked" : "" %> />여자<br>
	이메일: <input type="email" name="email" value="<%=(loginMember.getEmail() == null) ? "" : loginMember.getEmail() %>"><br>
	<button type="submit">수정하기</button>
</form>
<br>
<a href="main.jsp">메인화면으로 가기</a>

</body>
</html>




