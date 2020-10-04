package com.uqam.inf5190.labo4.action;

import com.opensymphony.xwork2.ActionSupport;
import com.uqam.inf5190.labo4.message.MessageStore;

public class MessageAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private MessageStore messageStore;
	public String execute() {
		
		messageStore =  new MessageStore();
		messageStore.setMessage("Bonjour de la part d'action");
		
		return SUCCESS;
	}
	
	public MessageStore getMessageStore() {
		return messageStore;
	}

}
