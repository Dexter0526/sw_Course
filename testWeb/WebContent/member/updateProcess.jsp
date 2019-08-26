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
// 사용자 패스워드 확인해서 본인확인함. 1이 리턴되면 성공.
int check = memberDao.userCheck(memberVO.getId(), memberVO.getPasswd());
//패스워드일치 1. 패스워드불일치 0 
if (check == 1) { 
	memberDao.updateMember(memberVO); // DB회원정보 수정하기
	
	// DB에서 수정된 회원정보 레코드를 가져오기
	MemberVO updatedMemberVO = memberDao.getMember(memberVO.getId());
	// 세션값 회원정보를 수정
	session.setAttribute("loginMember", updatedMemberVO);
	%>
	<script>
		alert('회원정보가 수정되었습니다.');
		location.href = 'main.jsp';
	</script>
	<%
} else {
	%>
	<script>
		alert('패스워드가 다릅니다.');
		history.back();
	</script>
	<%
}
%>

