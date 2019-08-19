<%@page import="com.exam.vo.MyBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- post 파라미터값 한글처리 --%>
<% request.setCharacterEncoding("utf-8"); %>

<%-- 파라미터값을 개별적인 변수에 따로 저장하는 방식 --%>
<%
// name, age 파라미터값 가져오기
//String name = request.getParameter("name");
//int age = Integer.parseInt(request.getParameter("age"));
%>



<%-- 자바빈 객체 생성 --%>
<% //MyBean myBean = new MyBean(); %>

<%-- 액션태그로 자바빈 객체 생성 --%>
<jsp:useBean id="myBean" class="com.exam.vo.MyBean" />




<%-- 파라미터값 찾아서 자바빈 객체 필드에 저장하기 --%>
<%
//myBean.setName(request.getParameter("name"));
//myBean.setAge(Integer.parseInt(request.getParameter("age")));
%>

<%-- 액션태그로 파라미터값 찾아서 자바빈 객체 필드에 저장하기 --%>
<%-- <jsp:setProperty property="age" param="myage" name="myBean"/> --%>
<%-- <jsp:setProperty property="age" name="myBean"/> --%>
<jsp:setProperty property="*" name="myBean"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 
이름: <%=name %><br> 
나이: <%=age %><br> 
--%>

<%-- 
이름: <%=myBean.getName() %><br>
나이: <%=myBean.getAge() %><br>
--%>

이름: <jsp:getProperty property="name" name="myBean"/><br>
나이: <jsp:getProperty property="age" name="myBean"/><br>
</body>
</html>

