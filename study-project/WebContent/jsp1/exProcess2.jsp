<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>exProcess2.jsp</h1>
<%
	String name = request.getParameter("name");
	String strAge = request.getParameter("age");
	// 문자열 -> 정수형
	int age = Integer.parseInt(strAge); // "20" -> 20
%>
이름 : <%=name %><br>
나이 : <%=age %><br>

</body>
</html>




