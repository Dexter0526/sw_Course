<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>



<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type = "text/css">
	tr {text-align: center}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String uid = "soul";
	String pass = "1234";
	String sql = "select * from employee";
	%>
	
	<table align = "center" border = "1" width = "500" cellspacing = "0" cellpadding = 5 >
		<tr>
			<th>이름 </th>
			<th>주소</th>
			<th>주민번호</th>
		</tr>
		
		<%
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, uid, pass);
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				if(!rs.next()){		//테이블에 조회된 회원의 레코드가 1건도 없을 경우
					out.print("<script> alert('정보가 없습니다'); </script>");
					out.print("<tr align = 'center'>");
					out.println("<td colspan = '3'> 등록된 회원 정보가 없습니다.</td>");
					out.println("</tr>");
				}
				
				while (rs.next()) {
					out.println("<tr>");
					out.println("<td>" + rs.getString(1) + "</td>");
					out.println("<td>" + rs.getString(2) + "</td>");
					out.println("<td>" + rs.getString(3).substring(0, 6)+"-"+rs.getString(3).substring(6) + "</td>");
				}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try{
					if(rs != null)
						rs.close();
					if(stmt != null)
						stmt.close();
					if(conn != null)
						conn.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		%>
	</table>
	

</body>
</html>