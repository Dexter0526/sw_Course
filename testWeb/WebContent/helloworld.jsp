<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello World!</h1>

<!-- html 주석 -->
<%-- jsp 주석 --%>

<%
	// 스크립트릿
	/*
	   범위 주석
	*/
	
	System.out.println("서버 콘솔출력");
	
	String str = "문자열";
	
	Date d = new Date(); // 오늘날짜 객체 생성
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	String strDate = sdf.format(d);
%>

출력: <%=str %><br><%-- 표현식 --%>
오늘날짜: <%=strDate %><br>

</body>
</html>



