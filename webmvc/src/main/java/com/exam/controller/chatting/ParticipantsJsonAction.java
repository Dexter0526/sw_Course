package com.exam.controller.chatting;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import com.exam.controller.Action;
import com.exam.controller.ActionForward;
import com.exam.websocket.Data;
import com.exam.websocket.RoomAndNickname;
import com.google.gson.Gson;

public class ParticipantsJsonAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String room = request.getParameter("room");

		List<String> nicknameList = new ArrayList<>();
		
		List<Session> sessionList = Data.roomsMap.get(room);
		for (Session session : sessionList) {
			RoomAndNickname roomAndNickname = Data.sessionIdAndRoomMap.get(session.getId());
			String nickname = roomAndNickname.getNickname();
			nicknameList.add(nickname);
		}
		
		Gson gson = new Gson();
		String str = gson.toJson(nicknameList);

		// JSON 객체 형식으로 응답 보내기
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(str);
		out.close();

		return null;
	}

}
