<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>div0</div>
	<div>div1</div>
	<div>div2</div>
	<h1>head0</h1>
	<h1>head1</h1>
	<h1>head2</h1>
	
<script src="../scripts/jquery-3.4.1.min.js"></script>
<script>
	// 이벤트  on()   click()  mouseover()  ....
	$('h1').on('mouseover', function () {
		$(this).html(function (index, oldhtml) {
			return oldhtml + '+';
		});
	});
	// click()
	$('div').click(function () {
		$(this).html(function (index, oldhtml) {
			return oldhtml + '★';
		});
	});
</script>
</body>
</html>


