<%@page import="com.exam.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function userId(){
	// window.opener
	opener.document.frm.id.value = wfrm.userid.value;
	close();
}
</script>
</head>
<body>
<%
	// "userid" 중복확인할 아이디 파라미터값 가져오기
	String userid = request.getParameter("userid");
	MemberDao memberDao = MemberDao.getInstance();
	boolean isIdDup = memberDao.isIdDuplicaed(userid);
	if(isIdDup){	
		%>
		사용중인 ID입니다.<br>
		<%
	}else{
		%>
		사용가능한 ID입니다.<br>
		<button type = "button" onclick="useId();">사용</button>
		<%
	}
%>

<form action = "joinIdDupCheck.jsp" method="get" name="wfrm">
	<input type ="text" name = "userid" value="<%=userid %>">
	<button type = "submit">중복확인</button>
</form>

</body>
</html>