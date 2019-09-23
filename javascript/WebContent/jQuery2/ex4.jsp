<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h1, a {
		border: 3px solid black;
	}
</style>
</head>
<body>
<div id="container">
	<h1><a href="http://www.naver.com">네이버</a></h1>
	<h1><a href="http://www.daum.net">다음카카오</a></h1>
</div>

<script src="../scripts/jquery-3.4.1.min.js"></script>
<script>
	// a태그 클릭 css() background-color 'blue'
	$('a').click(function (event) {
		$(this).css('background-color', 'blue');
		// 기본기능(a태그는 하이퍼링크) 막기
		//event.preventDefault();
		// 태그 겹쳐있을 경우 이벤트전파 막기
		//event.stopPropagation();
		
		return false; // 기본기능막기, 이벤트전파 막기
	});

	// h1태그 클릭 css() background-color 'red'
	$('h1').click(function () {
		$(this).css('background-color', 'red');
	});
</script>
</body>
</html>

