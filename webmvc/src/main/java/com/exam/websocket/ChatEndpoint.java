package com.exam.websocket;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.EncodeException;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.RemoteEndpoint.Basic;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/chatting/{room}/{nickname}", decoders = MessageDecoder.class, encoders = MessageEncoder.class)
public class ChatEndpoint {

	// 클라이언트와 연결된 이후 호출되는 메소드
	@OnOpen
	public void onOpen(Session session, @PathParam("room") String room, @PathParam("nickname") String nickname)
			throws IOException {

		if (!Data.roomsMap.containsKey(room)) { // 방이 없으면
			Data.roomsMap.put(room, new ArrayList<Session>()); // 방 개설
		}

		RoomAndNickname roomAndNickname = new RoomAndNickname(room, nickname);
		Data.sessionIdAndRoomMap.put(session.getId(), roomAndNickname);
		System.out.println(roomAndNickname);

		List<Session> sessionList = Data.roomsMap.get(room);
		sessionList.add(session);

		Message message = new Message();
		message.setNickname(nickname);
		message.setContent(nickname + "님이 채팅방에 참가하였습니다.");

		broadcast(room, session, message);
	}

	// 서버가 클라이언트로부터 메시지를 받았을때 호출되는 메소드
	@OnMessage
	public void onMessage(Session session, Message message) throws IOException {
		System.out.println(message);

		RoomAndNickname roomAndNickname = Data.sessionIdAndRoomMap.get(session.getId());
		String room = roomAndNickname.getRoom();

		if (message.getWhisperName().equals("")) {
			broadcast(room, session, message);
		} else {
			whisper(room, message);
		}
	}

	// 클라이언트와 연결이 끊어졌을때 호출되는 메소드
	@OnClose
	public void onClose(Session session) throws IOException {
		RoomAndNickname roomAndNickname = Data.sessionIdAndRoomMap.get(session.getId());
		String room = roomAndNickname.getRoom();
		String nickname = roomAndNickname.getNickname();

		Message message = new Message();
		message.setNickname(nickname);
		message.setContent(nickname + "님이 채팅방에서 퇴장하였습니다.");

		broadcast(room, session, message);

		List<Session> sessionList = Data.roomsMap.get(room);
		sessionList.remove(session);
		if (sessionList.size() == 0) {
			Data.roomsMap.remove(room);
		}

		Data.sessionIdAndRoomMap.remove(session.getId());
	}

	@OnError
	public void onError(Session session, Throwable throwable) {
		// Do error handling here
	}

	// 특정인 한명에게 귓속말 전송
	private synchronized static void whisper(String room, Message message) {
		List<Session> sessionList = Data.roomsMap.get(room);

		String whisperName = message.getWhisperName();
		for (Session session : sessionList) {
			RoomAndNickname roomAndNickname = Data.sessionIdAndRoomMap.get(session.getId());
			String nickname = roomAndNickname.getNickname();
			if (nickname.equals(whisperName)) {
				String content = message.getNickname() + "님이 " + whisperName + "님에게 귓속말: " + message.getContent();
				message.setContent(content);
				
				Basic basic = session.getBasicRemote();
				try {
					basic.sendObject(message);
				} catch (IOException | EncodeException e) {
					e.printStackTrace();
				}
				break;
			}
		}
	} // whisper

	// 모두에게 메시지 전송
	private synchronized static void broadcast(String room, Session selfSession, Message message) {
		List<Session> sessionList = Data.roomsMap.get(room);

		for (Session session : sessionList) {
			if (session.getId().equals(selfSession.getId())) {
				continue; // 메시지 보낸 당사자에게는 전송 제외하기
			}

			Basic basic = session.getBasicRemote();
			try {
				basic.sendObject(message);
			} catch (IOException | EncodeException e) {
				e.printStackTrace();
			}
		}
	} // broadcast

}
