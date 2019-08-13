<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원삭제</h1>
	<form action="deleteProcess.jsp" method="post">
		아이디 : <input type="text" name="id" /><br> 패스워드 : <input
			type="password" name="passwd" /><br>
		<button type="submit">회원 삭제하기</button>
	</form>
</body>
</html>