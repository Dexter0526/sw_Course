<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 세션 초기화(로그아웃 등에 사용)
	session.invalidate(); // 모든 저장된 요소를 remove삭제함.
%>
<script>
	alert('세션 초기화됨.');
	location.href = 'sessionEx.jsp';
</script>