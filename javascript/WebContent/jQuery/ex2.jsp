<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../scripts/jquery-3.4.1.min.js"></script>
<script>
function changeColor() {
	// 전체 선택자 *
	$('*').css('color', 'orange');
	// 태그 선택자    글자색 'red'
	$('h1').css('color', 'red');
	// 아이디 선택자  글자색 'blue'
	$('#aa').css('color', 'blue');
	// 클래스 선택자  글자색 'green'
	$('.bb').css('color', 'green');
}
	// 선택자.메소드().메소드().메소드()
	// 선택자 => 전체*  태그  아이디  클래스  속성  자식  자손  선택자
	
	$(document).ready(function () {
		// 버튼 태그에 클릭 이벤트 연결
		/*
		$('button').click(function () {
			// 전체 선택자 *
			$('*').css('color', 'orange');
			// 태그 선택자    글자색 'red'
			$('h1').css('color', 'red');
			// 아이디 선택자  글자색 'blue'
			$('#aa').css('color', 'blue');
			// 클래스 선택자  글자색 'green'
			$('.bb').css('color', 'green');
		});
		*/
		
		$('button').click(changeColor);

	});
	
</script>
</head>
<body>
	<h1>제목1</h1>
	<h1 id="aa">제목2</h1>
	<h1 class="bb">제목3</h1>
	<p>본문내용</p>
	<button>버튼</button>
</body>
</html>





