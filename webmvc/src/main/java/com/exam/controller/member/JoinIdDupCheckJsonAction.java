package com.exam.controller.member;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.exam.controller.Action;
import com.exam.controller.ActionForward;
import com.exam.dao.MemberDao;

public class JoinIdDupCheckJsonAction implements Action {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("JoinIdDupCheckJsonAction");
				
		String id = request.getParameter("id");
		
		// DAO 객체 준비
		MemberDao memberDao = MemberDao.getInstance();
		// 아이디 중복확인 메소드 호출
		boolean isIdDup = memberDao.isIdDuplicated(id);
		
//		JSONArray jsonArray = new JSONArray();
//		jsonArray.add(isIdDup); // 인덱스 0
//		jsonArray.add("테스트");// 인덱스 1
		
//		JSONObject jsonObject = new JSONObject();
//		jsonObject.put("isIdDup", isIdDup);
//		jsonObject.put("test", "테스트");
		
		// JSON 객체 형식으로 응답 보내기
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(isIdDup);
		out.close();
		
		return null;
	}

}
