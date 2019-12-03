package com.exam.websocket;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.websocket.Session;

public class Data {
	
	public static Map<String, List<Session>> roomsMap = new TreeMap<>();
	public static Map<String, RoomAndNickname> sessionIdAndRoomMap = new TreeMap<>();
	
}
