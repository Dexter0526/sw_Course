package com.exam.controller;

import java.util.HashMap;
import java.util.Map;

import com.exam.controller.board.NoticeAction;
import com.exam.controller.member.HistoryAction;
import com.exam.controller.member.JoinIdDupCheckAction;
import com.exam.controller.member.JoinIdDupCheckJsonAction;
import com.exam.controller.member.MainAction;
import com.exam.controller.member.MemberJoinAction;
import com.exam.controller.member.MemberJoinFormAction;
import com.exam.controller.member.MemberLoginAction;
import com.exam.controller.member.MemberLoginFormAction;
import com.exam.controller.member.MemberLogoutAction;
import com.exam.controller.member.WelcomeAction;

public class ActionFactory {

	private static ActionFactory instance = new ActionFactory();
		
	public static ActionFactory getInstance() {
		return instance;
	}
	
	private Map<String, Action> map = new HashMap<String, Action>();

	private ActionFactory() {
		// company
		map.put("/welcome.do", new WelcomeAction());
		map.put("/history.do", new HistoryAction());
		
		// member 명령어 관련 Action 객체 등록
		map.put("/memberJoinForm.do", new MemberJoinFormAction());
		map.put("/memberJoin.do", new MemberJoinAction());
		map.put("/memberLoginForm.do", new MemberLoginFormAction());
		map.put("/memberLogin.do", new MemberLoginAction());
		map.put("/main.do", new MainAction());
		map.put("/memberLogout.do", new MemberLogoutAction());
		
		// 아이디 중복확인
		map.put("/joinIdDupCheck.do", new JoinIdDupCheckAction());
		
		// 아이디 중복확인 Ajax 방식
		map.put("/joinIdDupCheckJson.do", new JoinIdDupCheckJsonAction());
		
		
		//========================================================
		
		// board 명령어 관련 Action 객체 등록
		map.put("notice.do", new NoticeAction());
		
	} // 생성자

	
	public Action getAction(String command) {
		Action action = map.get(command);
		return action;
	} // getAction method
	
}
