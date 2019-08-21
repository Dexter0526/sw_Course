<%@page import="com.exam.dao.MemberDao"%>
<%@page import="com.exam.vo.MemberVO"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//세션값 가져오기
MemberVO loginMember = (MemberVO) session.getAttribute("loginMember");

//세션값 없으면 loginForm.jsp 이동
if (loginMember == null) {
	response.sendRedirect("loginForm.jsp");
	return;
}
%>

<%
// post 파라미터값 한글처리
request.setCharacterEncoding("utf-8");
%>

<%-- 액션태그 userBean 자바빈 객체생성 --%>
<jsp:useBean id="memberVO" class="com.exam.vo.MemberVO"/>

<%-- 액션태그 setProperty 폼 -> 자바빈 필드에 저장 --%>
<jsp:setProperty property="*" name="memberVO"/>

<%
// DB객체 준비
MemberDao memberDao = MemberDao.getInstance();

// DB회원정보 수정하기 메소드 호출
int result = memberDao.updateMember(memberVO);
// 수정된 레코드를 가져오기
MemberVO updatedMemberVO = memberDao.getMember(memberVO.getId());

// result == 1 수정성공. main.jsp이동
// result == 0 패스워드틀림. 뒤로이동
if (result == 1) {
	// 세션값 회원정보 수정
	session.setAttribute("loginMember", updatedMemberVO);
	%>
	<script>
		alert('회원정보가 수정되었습니다.');
		location.href = 'main.jsp';
	</script>
	<%
} else { // result == 0
	%>
	<script>
		alert('패스워드가 다릅니다.');
		history.back();
	</script>
	<%
}
%>

