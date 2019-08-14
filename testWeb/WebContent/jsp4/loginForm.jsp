<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>

<h1>로그인</h1>

<form action="loginProcess.jsp" method="post">
	아이디: <input type="text" name="id" /><br>
	패스워드: <input type="password" name="passwd" /><br>
	<button type="submit">로그인</button>
	<button type="button" onclick="location.href='joinForm.jsp'">회원가입</button>
</form>

</body>
</html>





