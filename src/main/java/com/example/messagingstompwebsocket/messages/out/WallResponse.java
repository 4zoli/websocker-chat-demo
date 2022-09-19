package com.example.messagingstompwebsocket.messages.out;

public class WallResponse {

	private String content;

	public WallResponse() {
	}

	public WallResponse(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

}
