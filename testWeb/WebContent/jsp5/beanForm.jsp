<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력 폼 화면</title>
</head>
<body>
	<h1>입력 폼 화면</h1>
	<form action="beanProcess.jsp" method="post">
		이름: <input type="text" name="name"><br>
		나이: <input type="number" name="age" min="0" max="150"><br>
		<button type="submit">전송</button>
	</form>
</body>
</html>



