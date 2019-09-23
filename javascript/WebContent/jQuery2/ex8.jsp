<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div {
		width: 50px;
		height: 50px;
		background-color: orange;
	}
</style>
</head>
<body>

<div></div>

<script src="../scripts/jquery-3.4.1.min.js"></script>
<script>
	$('div').click(function () {
		var width = $(this).css('width');
		var height = $(this).css('height');
		console.log('width : ' + width);
		console.log('height : ' + height);
		console.log(typeof width);
		
		// parseInt() 정수형 숫자로, parseFloat() 실수형 숫자로
		width = parseInt(width); // '50px' -> 50
		height = parseInt(height); // '50px' -> 50
		console.log('width : ' + width);
		console.log('height : ' + height);
		console.log(typeof width);
		
		// 'slow'  'fast'  밀리초
		$(this).animate({
			width: width + 50,
			height: height + 50
		}, 300);
	});
</script>
</body>
</html>




