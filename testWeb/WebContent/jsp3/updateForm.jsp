<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정</title>
</head>
<body>

<h1>회원정보 수정</h1>

<form action="updateProcess.jsp" method="post">
	아이디: <input type="text" name="id" /><br>
	패스워드: <input type="password"  name="passwd" /><br>
	이름: <input type="text" name="name" /><br>
	<button type="submit">수정하기</button>
</form>

</body>
</html>



