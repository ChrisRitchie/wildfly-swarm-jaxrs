package com.ritchie;

public class MessageResponse {

	private String msg;

	public MessageResponse(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	@SuppressWarnings("unused")
	private void setMsg(String msg) {
		this.msg = msg;
	}
}
