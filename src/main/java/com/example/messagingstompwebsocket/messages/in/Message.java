package com.example.messagingstompwebsocket.messages.in;

public class Message {

	private String userName;

	private String content;

	public Message() {
	}

	public Message(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
