<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<button type="button">버튼</button>
	
	<div id="container">
		<section>본문영역</section>
	</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
$('button').on('click', function() {
	//html() 함수처럼 동작하는 함수.
	// append()   기존내용 뒤에추가
	// prepend()  기존내용 앞에추가
	// var변수 : 함수블록 기준으로 수명주기 유지됨
	// let변수 : 코드블록 기준으로 수명주기 유지됨
	// const상수
	let str1 = '<h1>header1</h1>';
	let str2 = '<h2>header2</h2>';
	
	$('div#container').append(str2);
	$('div#container').prepend(str1);
	
	$(str1).appendTo('div#container');
});
</script>
</body>
</html>



