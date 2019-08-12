<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>exProcess3.jsp</h1>
<%
	// post 방식 파라미터값 한글처리
	request.setCharacterEncoding("utf-8");

	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String job = request.getParameter("job");
	// value값이 여러개라면 -> String[] 배열로 가져오기
	String[] seasonArr = request.getParameterValues("season");
%>
이름: <%=name %><br>
성별: <%=gender %><br>
직업: <%=job %><br>
좋아하는 계절:
<%
if (seasonArr != null) {
	for (String season : seasonArr) {
		%><%=season %> &nbsp; <%
	}
}
%>

</body>
</html>


