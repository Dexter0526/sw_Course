<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>response.jsp</h1>
	<%
	// response : 서버처리 결과를 응답정보로 돌려주는 용도의 객체
	
	// sendRedirect() 메소드는 서버가 클라이언트에게
	//  리다이렉트 정보를 보내서 서버가 시킨대로 이동하도록 함.
	//  리다이렉트 정보만 보내고 화면정보는 안보냄.
	if (true) {
		//response.sendRedirect("http://www.naver.com");
		//response.sendRedirect("request.jsp");
	}
	%>
	
	<%
	// session : 클라이언트마다 한개씩 생성됨.
	//           클라이언트마다 유지해야되는 정보를 관리.
	%>
	세션ID: <%=session.getId() %><br>
	세션생성시간: <%=session.getCreationTime() %><br>
	세션유지시간: <%=session.getMaxInactiveInterval() %><br>
	
	
	<%
	// application : 웹애플리케이션 당 유지되는 객체
	%>
	서버정보: <%=application.getServerInfo() %><br>
	물리적경로: <%=application.getRealPath("/") %><br>
	
	
	
</body>
</html>




