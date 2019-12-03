package com.exam.websocket;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import com.google.gson.Gson;

public class MessageEncoder implements Encoder.Text<Message> {
	
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
	public String encode(Message object) throws EncodeException {
		return gson.toJson(object);
	}

}
