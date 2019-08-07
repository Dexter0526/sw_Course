<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- JSP 스크립트릿 안에서 만든 변수는 지역변수 --%>
	<% String str = name + " Server Page"; %>
	
	<%! // 선언
		// JSP -> 서블릿 변환되면
		// 서블릿의 멤버들이 됨
		private String name = "Java"; // 전역변수(=필드)
	
		public String getName() { // 메소드 정의
			return name;
		}
	%>
	<%=str %><br>
	<%=getName() %><br>
	
	<%
		int result = 10 + 20;
		out.println("결과: " + result + "<br>");
	%>
	<br>
	결과 : <%=result %><br>
	<%=1 + 2 %><br>
</body>
</html>






