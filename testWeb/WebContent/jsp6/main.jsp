<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	* {
		border: 1px solid red;
	}
	
	div#container {
		width: 800px;
		height: 500px;
		background-color: lightgrey;
		margin-left: auto;
		margin-right: auto;
	}
	
	nav {
		width: 198px;
		height: 300px;
		background-color: yellow;
		float: left;
	}
	
	section {
		width: 598px;
		height: 400px;
		background-color: pink;
		float: right;
	}
	
	footer {
		clear: both;
	}
	
	
</style>
</head>
<body>
<div id="container">
	<header>
		<jsp:include page="header.jsp">
			<jsp:param value="admin" name="id"/>
		</jsp:include>
	</header>
	
	<nav>네비게이션</nav>
	
	<section>
		본문내용
	</section>
	
	<footer>
		푸터
	</footer>
</div>
</body>
</html>