<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 세션: 클라이언트당 유지되는 정보 저장
	//       서버에서 관리하는 객체. 보안이 뛰어남.
	//       로그인 인증 용도로 많이 사용.
	
	// 세션값 가져오기
	String name = (String) session.getAttribute("name");
		
// 	int age = 0;
// 	if (session.getAttribute("age") != null) {
// 		age = (Integer) session.getAttribute("age");
// 	}

	Integer age = (Integer) session.getAttribute("age");

%>
<h1>sessionEx.jsp</h1>
<h3>세션값 이름: <%=name %></h3>
<h3>세션값 나이: <%=age %></h3>
<button onclick="location.href='sessionSet.jsp';">세션값 저장</button>
<button onclick="location.href='sessionDel.jsp';">세션값 삭제</button>
<button onclick="location.href='sessionInval.jsp';">세션 초기화</button>

</body>
</html>




