<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="com.exam.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@page import="com.exam.dao.MemberDao"%>
<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// DB객체 준비
MemberDao memberDao = MemberDao.getInstance();
List<MemberVO> memberList = memberDao.getMembers();
// json-simple 라이브러리 빌드패스에 추가
// List를 JSONArray 타입으로 변환
// VO를 JSONObject 타입으로 변환

//JSONArray 객체 준비
JSONArray jsonArray = new JSONArray();
for(MemberVO memberVO : memberList){
	JSONObject jsonObject = new JSONObject();	//{}
	
	jsonObject.put("id", memberVO.getId());
	jsonObject.put("passwd", memberVO.getPasswd());
	jsonObject.put("name", memberVO.getName());
	
	jsonArray.add(jsonObject);
}

%>
<%=jsonArray%>
