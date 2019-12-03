package com.exam.controller.chatting;

import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exam.controller.Action;
import com.exam.controller.ActionForward;
import com.exam.websocket.Data;
import com.google.gson.Gson;

public class CheckRoomNameDuplicateJsonAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String room = request.getParameter("room");
		
		Set<String> roomsSet = Data.roomsMap.keySet();
		boolean isRoomDuplicate = roomsSet.contains(room);

		// JSON 객체 형식으로 응답 보내기
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(isRoomDuplicate);
		out.close();

		return null;
	}

}
