<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>exProcess1.jsp</h1>

<!-- 
	request 객체 : 요청정보를 저장하는 객체
	request.getParameter("파라미터이름"); -> String으로 리턴
 -->

<%
	// 사용자 입력값은 String으로 찾음
	String strNum = request.getParameter("num");
	int num = Integer.parseInt(strNum);
%>
파라미터값 문자열 : <%=strNum %><br>
파라미터값 문자열 + 10 : <%=strNum + 10 %><br>
파라미터값 정수 + 10 : <%=num + 10 %><br>

</body>
</html>





