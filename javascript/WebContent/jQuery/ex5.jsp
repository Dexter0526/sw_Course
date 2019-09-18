<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.high_0 { background-color: yellow; }
	.high_1 { background-color: orange; }
	.high_2 { background-color: blue; }
	.high_3 { background-color: green; }
	.high_4 { background-color: red; }
</style>
</head>
<body>
	<button>버튼</button>
	<h1>item-0</h1>
	<h1>item-1</h1>
	<h1>item-2</h1>
	<h1>item-3</h1>
	<h1>item-4</h1>
	
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
	$('button').click(function () {
		// h1요소를 가진 리스트를 리턴함. 
		// each동작으로 요소 하나하나를 처리하는 함수를 전달.
		$('h1').each(function (index, item) {
			$(this).addClass('high_' + index);
		});
	});
</script>
</body>
</html>


