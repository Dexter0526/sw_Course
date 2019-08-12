<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 세션 초기화
	session.invalidate();

	// 이동 sessionLogin.jsp
	//response.sendRedirect("sessionLogin.jsp");
%>
<script>
	alert('로그아웃 되었습니다.');
	location.href = 'sessionLogin.jsp';
</script>