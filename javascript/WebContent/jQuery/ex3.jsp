<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../scripts/jquery-3.4.1.min.js"></script>
<script>
$(document).ready(function () {
	// 속성 선택자, 홀수짝수 선택자...
	
	// 태그[속성=값]
	// 태그[속성^=값]  시작값
	// 태그[속성~=값]  포함
	// 태그[속성$=값]  끝값
	$('input[type="text"]').val('Hello~~');
	
	// 태그:odd   홀수번째(인덱스번호 기준. 0부터 시작)
	// 태그:even  짝수번째
	// 태그:first 첫번째
	// 태그:last  마지막번째
	$('tr:odd').css('background-color', 'yellow');
	$('tr:even').css('background-color', 'green');
	$('tr:first').css('background-color', 'blue');
});
</script>
</head>
<body>
	아이디: <input type="text"><br>
	패스워드: <input type="password"><br>
	
	<table border="1">
		<tr>
			<th>이름</th><th>혈액형</th><th>지역</th>
		</tr>
		<tr>
			<td>홍길동</td><td>A</td><td>부산</td>
		</tr>
		<tr>
			<td>성춘향</td><td>B</td><td>서울</td>
		</tr>
		<tr>
			<td>이몽룡</td><td>O</td><td>대전</td>
		</tr>
		<tr>
			<td>이순신</td><td>AB</td><td>대구</td>
		</tr>
	</table>

</body>
</html>




