<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	ul {
		list-style-type: none;
	}
	
	img {
		width: 500px;
		height: 350px;
	}
	
	div, ul, li, img {
		margin: 0;
		padding: 0;
	}
</style>
</head>
<body>

<div id="container">
	<ul id="inner_fade">
		<li><img src="../images/ggbg.gif"></li>
		<li><img src="../images/km.jpg"></li>
		<li><img src="../images/rt_arch.jpg"></li>
		<li><img src="../images/tuev.jpg"></li>
		<li><img src="../images/whizzkids.gif"></li>
	</ul>
</div>


<script src="../scripts/jquery-3.4.1.min.js"></script>
<script src="../scripts/jquery.innerfade.js"></script>
<script>
	// https://medienfreunde.de/lab/innerfade/
	$('#inner_fade').innerfade({
		animationtype: 'slide',
		speed: 750,
		timeout: 2000,
		type: 'random'
	});
</script>
</body>
</html>




