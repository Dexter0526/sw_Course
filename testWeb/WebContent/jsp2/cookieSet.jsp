<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 쿠키 생성
Cookie cookie1 = new Cookie("name", "홍길동");
Cookie cookie2 = new Cookie("age", "33");

// 쿠키 유효시간(유통기간) 설정 (초단위)
cookie1.setMaxAge(60*10); // 10분 = 60초 * 10 = 600초

// 쿠키는 자신이 생성된 URL주소와 함께 클라이언트로 전송됨.
// 클라이언트가 쿠키생성 URL주소를 방문할때만 해당 쿠키가 서버로 전송됨.

// naver.com/a 에서 생성된 쿠키는
// 사용자가 naver.com/a 이하의 경로를 방문할때만 쿠키가 서버로 전송됨.
// naver.com/a/b 방문할때도 쿠키가 서버로 전송됨.

// naver.com을 방문하면 쿠키가 서버로 전송이 안됨!

// 쿠키 경로를 최상위 경로로 강제 설정.
cookie1.setPath("/");
cookie2.setPath("/");


cookie2.setMaxAge(60*60*24*7); // 7일 = 60초*60*24*7

// 브라우저로 응답보내어 브라우저가 파일로 쓰게 하기
response.addCookie(cookie1);
response.addCookie(cookie2);
%>
<script>
	alert('쿠키값 name, age 생성됨.');
	location.href = 'cookieEx.jsp';
</script>





