<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<script>
function check(){
	// frm.id.value.length == 0 or
//	if(document.frm.id.value == ''){
//		alert('아이디 필수입력 입니다.');
//		frm.id.focus();
//		return false;
//	}
	
	// 아이디가 3글자 이상 13글자 이하
	if(document.frm.id.value.length < 3 || document.frm.id.value.length > 14){
		alert('아이디 3글자 이상 13글자 이하로 작성해주세요.');
		frm.id.select();
		return false;
	}
	return true;
}
</script>
</head>
<body>

<h1>회원 가입</h1>

<form name="frm" action="joinProcess.jsp" method="post" onsubmit = "return check();">
	아이디: <input type="text" name="id" required/><br>
	패스워드: <input type="password" name="passwd" required/><br>
	이름: <input type="text" name="name" required/><br>
	나이: <input type="text" name="age" /><br>
	성별: <input type="radio" name="gender" value="남" />남자
	      <input type="radio" name="gender" value="여" />여자<br>
	이메일: <input type="email" name="email" /><br>
	<button type="submit" >회원가입</button>
</form>

</body>
</html>





