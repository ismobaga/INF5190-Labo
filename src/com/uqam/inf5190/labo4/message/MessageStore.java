package com.uqam.inf5190.labo4.message;

public class MessageStore {
	private String message;

	public MessageStore() {
		message = "Bonjour Utiisateurs Struts";
	}

	public void setMessage(String msg) {
		message = msg;

	}

	public String getMessage() {
		return message;
	}

}
