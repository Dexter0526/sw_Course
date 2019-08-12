<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>request.jsp 페이지</h1>
	<!-- http://localhost:80/study-project/jsp1/request.jsp -->
	서버 도메인명: <%=request.getServerName() %><br>
	서버 포트번호: <%=request.getServerPort() %><br>
	URL주소: <%=request.getRequestURL() %><br>
	URI주소: <%=request.getRequestURI() %><br>
	클라이언트IP주소: <%=request.getRemoteAddr() %><br>
	프로토콜: <%=request.getProtocol() %><br>
	전송방식: <%=request.getMethod() %><br>
	컨텍스트 경로: <%=request.getContextPath() %><br>
	세션연결정보: <%=request.getRequestedSessionId() %><br>
	http헤더정보(user-agent): <%=request.getHeader("user-agent") %><br>
	http헤더정보(connection): <%=request.getHeader("connection") %><br>
</body>
</html>




