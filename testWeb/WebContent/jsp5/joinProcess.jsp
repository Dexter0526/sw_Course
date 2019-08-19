<%@page import="com.exam.vo.MemberVo"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- post 파라미터값 한글처리 --%>
<% request.setCharacterEncoding("utf-8"); %>

<%-- 액션태그로 자바빈 객체 생성 --%>
<jsp:useBean id="memberVo" class="com.exam.vo.MemberVo"/>

<%-- 액션태그로 파라미터값 찾아서 자바빈 객체에 저장 --%>
<jsp:setProperty property="*" name="memberVo"/>

<%-- 가입날짜 생성해서 채우기 --%>
<%memberVo.setRegDate(new Timestamp(System.currentTimeMillis())); %>

<%-- 액션태그로 자바빈 값 각각 출력 --%>
아이디: <jsp:getProperty property="name" name="memberVo"/>
패스워드: <jsp:getProperty property="passwd" name="memberVo"/>
이름: <jsp:getProperty property="name" name="memberVo"/>
나이: <jsp:getProperty property="age" name="memberVo"/>
성별: <jsp:getProperty property="gender" name="memberVo"/>
이메일: <jsp:getProperty property="email" name="memberVo"/>
입력날짜 : <jsp:getProperty property="regDate" name="memberVo"/>

