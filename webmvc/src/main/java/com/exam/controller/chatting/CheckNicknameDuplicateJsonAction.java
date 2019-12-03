package com.exam.controller.chatting;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import com.exam.controller.Action;
import com.exam.controller.ActionForward;
import com.exam.websocket.Data;
import com.exam.websocket.RoomAndNickname;

public class CheckNicknameDuplicateJsonAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String room = request.getParameter("room");
		String nickname = request.getParameter("nickname");
		
		List<Session> sessionList = Data.roomsMap.get(room);
		
		boolean isNicknameDuplicate = false;
		for (Session session : sessionList) {
			RoomAndNickname roomAndNickname = Data.sessionIdAndRoomMap.get(session.getId());
			if (roomAndNickname.getNickname().equals(nickname)) {
				isNicknameDuplicate = true;
				break;
			}
		} // for
		
		// JSON 객체 형식으로 응답 보내기
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(isNicknameDuplicate);
		out.close();
		
		return null;
	}

}
