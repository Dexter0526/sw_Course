<%@page import="com.exam.dao.MemberDao"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// post 파라미터값 한글처리
request.setCharacterEncoding("utf-8");
%>

<%-- 액션태그 userBean 자바빈 객체생성 --%>
<jsp:useBean id="memberVO" class="com.exam.vo.MemberVO"/>

<%-- 액션태그 setProperty 폼 -> 자바빈 필드에 저장 --%>
<jsp:setProperty property="*" name="memberVO"/>

<%
// 가입날짜 set메소드 호출해서 값 저장
memberVO.setRegDate(new Timestamp(System.currentTimeMillis()));

// DB객체 준비
MemberDao memberDao = MemberDao.getInstance();
// 회원가입 메소드 호출
int rowCount = memberDao.insertMember(memberVO);
if (rowCount > 0) {
	%>
	<script>
		alert('회원가입 되었습니다.');
		location.href = 'loginForm.jsp'; // 이동
	</script>
	<%
} else {
	%>
	<script>
		alert('회원가입이 실패했습니다.');
		history.back(); // 뒤로가기 (회원가입 폼 화면)
	</script>
	<%
}
%>





