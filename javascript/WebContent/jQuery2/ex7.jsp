<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div.contents {
		display: none;
	}
</style>
</head>
<body>
<div id="container">
	<h1>열기&amp;닫기</h1>
	<div class="contents">
		<h1>제목1</h1>
		<p>내용1</p>
	</div>
	
	<h1>열기&amp;닫기</h1>
	<div class="contents">
		<h1>제목2</h1>
		<p>내용2</p>
	</div>
</div>

<script src="../scripts/jquery-3.4.1.min.js"></script>
<script>
	// css의 display속성값을 기준으로 동작함
	// 효과  show()       hide()      toggle()
	//       slideDown()  slideUp()   slideToggle()
	//       fadeIn()     fadeOut()   fadeToggle()
	// 'h1' 클릭이벤트  h1의 다음요소를 토글방식으로 동작
	$('h1').click(function () {
		$(this).next().toggle(500, function () {
			alert('애니메이션 효과 끝~!');
		});
	});

</script>
</body>
</html>



