<%@page import="java.util.List"%>
<%@page import="com.exam.dao.MemberDao"%>
<%@page import="com.exam.vo.MemberVO"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 회원목록</title>
</head>
<body>

<%
// 세션값 가져오기
MemberVO loginMember = (MemberVO) session.getAttribute("loginMember");
// 세션값 id가 없거나(null) 또는 admin이 아니면 main.jsp로 이동
if (loginMember == null || !loginMember.getId().equals("admin")) {
	response.sendRedirect("main.jsp");
	return;
}
%>

<% 
// DAO 준비
MemberDao memberDao = MemberDao.getInstance();
// 전체회원정보 가져오기 메소드 호출
List<MemberVO> memberList = memberDao.getMembers();
%>

<h1>전체 회원목록</h1>

<table border="1">
	<tr>
		<th>아이디</th>
		<th>패스워드</th>
		<th>이름</th>
		<th>성별</th>
		<th>나이</th>
		<th>이메일</th>
		<th>가입일자</th>
	</tr>
	<%
	if (memberList.size() > 0) {
		for (MemberVO member : memberList) {
			%>
			<tr>
				<td><%=member.getId() %></td>
				<td><%=member.getPasswd() %></td>
				<td><%=member.getName() %></td>
				<td><%=member.getGender() %></td>
				<td><%=member.getAge() %></td>
				<td><%=member.getEmail() %></td>
				<td><%=member.getRegDate() %></td>
			</tr>
			<%
		}
	} else { // memberList.size() == 0
		%>
		<tr>
			<td colspan="7">
				회원 레코드가 없습니다.
			</td>
		</tr>
		<%
	}
	%>
</table>

<a href="main.jsp">메인화면으로 가기</a>

</body>
</html>




