package com.exam.controller.chatting;

import java.util.ArrayList;
import java.util.Collections;
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

public class ChattingRoomsListAction implements Action {

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
		
		request.setAttribute("roomsList", list);
		
		ActionForward forward = new ActionForward();
		forward.setPath("solutions/chatting_rooms_list"); // jsp경로
		forward.setRedirect(false); // 직접실행
		return forward;
	}

}
