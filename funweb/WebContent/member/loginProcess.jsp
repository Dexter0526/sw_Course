<%@page import="com.exam.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
// poset 파라미터값 한글처리
request.setCharacterEncoding("utf-8");

%>

<%
String id = request.getParameter("id");
String passwd = request.getParameter("passwd");
String rememberMe = request.getParameter("rememberMe");

MemberDao memberDao = MemberDao.getInstance();
int check = memberDao.userCheck(id, passwd);
if(check == 1){
	session.setAttribute("id", id);
	// 로그인 상태 유지
	if(rememberMe != null){
		Cookie cookie = new Cookie("id",id);
		cookie.setMaxAge(60*10);	// 초단위
		cookie.setPath("/");	// 쿠기경로 설정
		response.addCookie(cookie);
	}
	response.sendRedirect("../index.jsp");
}else if(check == 0){
	%>
	<script>
	alert('패스워드가 틀립니다.');
	history.back();
	</script>
	<%
}else{
	%>
	<script>
	alert('존재하지 않는 아이디 입니다.');
	history.back();
	</script>
	<%
}
%>
