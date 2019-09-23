<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<img src="../images/img1.jpg" width="100" height="100" class="img1">

<script src="../scripts/jquery-3.4.1.min.js"></script>
<script>
	// mouseover    mouseout
	$('.img1').mouseover(function () {
		$(this).attr('src', '../images/img2.jpg');
	}).mouseout(function () {
		$(this).attr('src', '../images/img1.jpg');
	});
</script>
</body>
</html>

