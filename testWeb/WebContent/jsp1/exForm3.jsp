<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>exForm3.jsp</h1>
<form action="exProcess3.jsp" method="get">
이름: <input type="text" name="name"><br>
성별: <input type="radio" name="gender" value="male" checked>남자
      <input type="radio" name="gender" value="female">여자<br>
직업: <select name="job">
	      <option value="학생">학생</option>
	      <option value="회사원" selected>회사원</option>
	      <option value="기타">기타</option>
	  </select><br>
좋아하는 계절: 
	<input type="checkbox" name="season" value="봄">봄
	<input type="checkbox" name="season" value="여름" checked>여름
	<input type="checkbox" name="season" value="가을" checked>가을
	<input type="checkbox" name="season" value="겨울">겨울
<br><br>
<button type="submit">전송</button>
<button type="reset">초기화</button>
</form>
</body>
</html>






