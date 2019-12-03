package com.exam.websocket;

public class Message {
	private String nickname;
	private String content;
	private String whisperName;
	
	public Message() {
	}
	
	public Message(String nickname, String content, String whisperName) {
		this.nickname = nickname;
		this.content = content;
		this.whisperName = whisperName;
	}
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWhisperName() {
		return whisperName;
	}
	public void setWhisperName(String whisperName) {
		this.whisperName = whisperName;
	}

	@Override
	public String toString() {
		return "Message [nickname=" + nickname + ", content=" + content + ", whisperName=" + whisperName + "]";
	}
	
}
