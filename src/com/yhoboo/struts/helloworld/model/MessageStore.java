package com.yhoboo.struts.helloworld.model;

public class MessageStore {
	
	public String message;
	
	public MessageStore() {
		message="Hello Struts User";
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public String toString() {
		return message + " (from toString)";
	}

}
