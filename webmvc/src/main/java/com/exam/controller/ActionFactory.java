package com.exam.controller;

import java.util.*;

import com.exam.controller.board.*;
import com.exam.controller.chatting.*;
import com.exam.controller.member.*;

public class ActionFactory {

	private static ActionFactory instance = new ActionFactory();
		
	public static ActionFactory getInstance() {
		return instance;
	}
	
	private Map<String, Action> map = new HashMap<String, Action>();

	private ActionFactory() {
		// 생성자에서 미리 컨트롤러(Action클래스) 등록하기
		
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
		
		//==================================================
		
		// board 명령어 관련 Action 객체 등록
		map.put("/notice.do", new NoticeAction());
		map.put("/writeForm.do", new WriteFormAction());
		map.put("/write.do", new WriteAction());
		map.put("/content.do", new ContentAction());
		map.put("/updateForm.do", new UpdateFormAction());
		map.put("/update.do", new UpdateAction());
		map.put("/deleteForm.do", new DeleteFormAction());
		map.put("/delete.do", new DeleteAction());
		map.put("/reWriteForm.do", new ReWriteFormAction());
		map.put("/reWrite.do", new ReWriteAction());
		map.put("/fnotice.do", new FileNoticeAction());
		map.put("/fwriteForm.do", new FileWriteFormAction());
		map.put("/fwrite.do", new FileWriteAction());
		map.put("/fcontent.do", new FileContentAction());
		map.put("/fdelete.do", new FileDeleteAction());
		map.put("/fupdateForm.do", new FileUpdateFormAction());
		map.put("/fupdate.do", new FileUpdateAction());
		
		map.put("/chattingRoomsList.do", new ChattingRoomsListAction());
		map.put("/chattingRoomsListJson.do", new ChattingRoomsListJsonAction());
		map.put("/checkRoomNameDuplicateJson.do", new CheckRoomNameDuplicateJsonAction());
		map.put("/checkNicknameDuplicateJson.do", new CheckNicknameDuplicateJsonAction());
		map.put("/chatting.do", new ChattingAction());
		map.put("/participantsJson.do", new ParticipantsJsonAction());
	} // 생성자

	
	public Action getAction(String command) {
		Action action = map.get(command);
		return action;
	} // getAction method
	
}
