<%@page import="com.exam.dao.MemberDao"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// post 파라미터값 한글처리
	request.setCharacterEncoding("utf-8");

	// 폼 id passwd 파라미터값 가져오기
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");

	// DB객체 준비
	MemberDao memberDao = MemberDao.getInstance();

	// 로그인 확인하는 메소드 호출
	// check == 1  로그인인증. main.jsp로 이동
	// check == 0  패스워드틀림. 뒤로이동
	// check == -1 아이디없음. 뒤로이동
	int check = memberDao.userCheck(id, passwd);

	if (check == 1) {
		// 로그인 인증
		session.setAttribute("id", id);
		
		// main.jsp 로 이동
		response.sendRedirect("main.jsp");
	} else if (check == 0) {
		%>
		<script>
			alert('패스워드가 다릅니다.');
			history.back();
		</script>
		<%
	} else { // check == -1
		%>
		<script>
			alert('없는 아이디 입니다.');
			//location.href = 'loginForm.jsp';
			history.back();
		</script>
		<%
	}
%>



