<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="container">
	<form action="" id="my_form" onsubmit="return check()">
		이름: <input type="text" name="name" id="name"><br>
		패스워드: <input type="password" name="passwd" id="passwd"><br>
		<input type="submit" value="제출">
	</form>
</div>

<script src="../scripts/jquery-3.4.1.min.js"></script>
<script>
	$('#my_form').submit(function (event) {
		// 폼 객체의 기본기능(action호출) 막기
		event.preventDefault();
		
		var name = $('#name').val();
		var passwd = $('#passwd').val();
		alert(name + ' : ' + passwd);
	});
</script>
</body>
</html>


