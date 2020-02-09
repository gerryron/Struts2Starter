package com.yhoboo.java;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport{
	
	private MessageStore messageStore;
	private static int helloCount = 0;
	private String userName;

	public MessageStore getMessageStore() {
		return messageStore;
	}
	
	public int getHelloCount() {
		return helloCount;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String execute() throws Exception{
		messageStore = new MessageStore();
		if(userName != null) {
			messageStore.setMessage(messageStore.getMessage()+" "+userName);
		}
		helloCount++;
		return SUCCESS;
	}
	
}
