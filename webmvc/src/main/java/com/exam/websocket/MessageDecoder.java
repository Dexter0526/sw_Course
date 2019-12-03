package com.exam.websocket;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

import com.google.gson.Gson;

public class MessageDecoder implements Decoder.Text<Message> {
	
	private static Gson gson = new Gson();

	@Override
	public void destroy() {
		// close resources
	}

	@Override
	public void init(EndpointConfig config) {
		// custom initialization logic
	}

	@Override
	public Message decode(String s) throws DecodeException {
		return gson.fromJson(s, Message.class);
	}

	@Override
	public boolean willDecode(String s) {
		return (s != null);
	}

}
