<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 세션 영역(Scope)객체 - Map 컬렉션으로 사용
	
	// 세션객체에 값 생성(추가)
	session.setAttribute("name", "홍길동 세션값");
	session.setAttribute("age", 33); // Integer로 저장
	
	// 앞에 화면으로 이동
	//response.sendRedirect("sessionEx.jsp");
%>
<script>
	alert('세션값 생성됨.');
	location.href = 'sessionEx.jsp';
</script>



