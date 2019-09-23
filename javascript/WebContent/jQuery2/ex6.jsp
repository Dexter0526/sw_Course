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
<div></div>

<script src="../scripts/jquery-3.4.1.min.js"></script>
<script>
	// 정적 이벤트 연결
	$('button').on('click', function () {
		alert('버튼 클릭됨!');
		var str = '<button type="button" class="new_btn">새버튼</button>';
		$('div').append(str);
	});
	
	// 동적 이벤트 연결
	$(document).on('click', 'button.new_btn', function () {
		alert('새버튼이 클릭됨!');
	});
</script>
</body>
</html>



