<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// lang 파라미터값 가져오기
String lang = request.getParameter("lang");

// 쿠키값 생성. 파라미터값으로 저장
Cookie cookie = new Cookie("language", lang);

cookie.setPath("/");
cookie.setMaxAge(60*60*24); // 하루(24시간) = 60초*60*24

// 클라이언트로 보내기(저장)
response.addCookie(cookie);
%>
<script>
	alert('언어 쿠키값 생성됨.');
	location.href = 'cookieForm.jsp';
</script>






