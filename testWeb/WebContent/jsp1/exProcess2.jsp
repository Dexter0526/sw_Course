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
	// post 요청방식으로 넘어온 한글데이터를 찾을때 한글처리함
	request.setCharacterEncoding("utf-8");

	String name = request.getParameter("name");
	String strAge = request.getParameter("age");
	
	// 문자열 -> 정수형
	int age = Integer.parseInt(strAge); // "20" -> 20
%>
이름 : <%=name %><br>
나이 : <%=age %><br>

<%
	// 나이값이 20살 이상이면 -> "20세 이상 성인입니다."
	//                아니면  -> "미성년자 입니다."
	if (age >= 20) {
		out.println("20세 이상 성인입니다.<br>");
	} else {
		out.println("미성년자 입니다.<br>");
	}
%>
<br><br>
<%
	if (age >= 20) {
		%>
		20세 이상 성인입니다.<br>
		<%
	} else {
		%>
		미성년자 입니다.<br>
		<%
	}
%>
</body>
</html>




