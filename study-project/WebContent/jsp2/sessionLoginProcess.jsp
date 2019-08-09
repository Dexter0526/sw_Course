<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// post 방식 입력문자를 유티코드로 처리
request.setCharacterEncoding("utf-8");

// 사용자 입력 파라미터값 가져오기
String id = request.getParameter("id");
String passwd = request.getParameter("passwd");
	
// DB의 아이디, 패스워드
String dbId = "admin";
String dbPasswd = "pass123";

// 문자열 같다  .equals()
// 폼 입력 아이디와 DB의 아이디 비교해서 같으면
// 폼 입력 패스워드와 DB패스워드가 같으면 "로그인 성공"
//                      -> 세션값 생성. 메인페이지로 이동 sessionMain.jsp

// 폼 입력 패스워드와 DB패스워드가 다르면 "패스워드 틀림";

// 폼 입력 아이디와 DB의 아이디 비교해서 다르면 "해당 아이디 없음"
if (id.equals(dbId)) {
	// 아이디 있음
	if (passwd.equals(dbPasswd)) {
		//out.println("로그인 성공!<br>");
		session.setAttribute("id", id); // 로그인 처리
		response.sendRedirect("sessionMain.jsp");
	} else {
		//out.println("패스워드 틀림<br>");
		%>
		<script>
			alert('패스워드 틀림');
			history.back();
		</script>
		<%		
		//response.sendRedirect("sessionLogin.jsp");
	}
} else {
	//out.println("해당 아이디 없음<br>");
	%>
	<script>
		alert('해당 아이디 없음');
		//location.href = 'sessionLogin.jsp';
		history.back(); // 뒤로가기 버튼 클릭에 해당
	</script>
	<%
}
%>






