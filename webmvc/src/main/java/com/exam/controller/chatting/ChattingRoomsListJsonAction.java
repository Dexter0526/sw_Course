package com.exam.controller.chatting;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import com.exam.controller.Action;
import com.exam.controller.ActionForward;
import com.exam.websocket.Data;
import com.google.gson.Gson;

public class ChattingRoomsListJsonAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		
		Set<String> roomsSet = Data.roomsMap.keySet();
		
		for (String room : roomsSet) {
			List<Session> sessionList = Data.roomsMap.get(room);
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("room", room);
			map.put("size", sessionList.size());
			
			list.add(map);
		}
		
		
		Gson gson = new Gson();
		String str = gson.toJson(list);
		
		// JSON 객체 형식으로 응답 보내기
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(str);
		out.close();

		return null;
	}

}
