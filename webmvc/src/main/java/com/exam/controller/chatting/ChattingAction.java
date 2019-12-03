package com.exam.controller.chatting;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exam.controller.Action;
import com.exam.controller.ActionForward;

public class ChattingAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String nickname = request.getParameter("nickname");
		String room = request.getParameter("room");
		
		request.setAttribute("nickname", nickname);
		request.setAttribute("room", room);
		
		ActionForward forward = new ActionForward();
		forward.setPath("solutions/chatting_websocket"); // jsp경로
		forward.setRedirect(false); // 직접실행
		return forward;
	}

}
