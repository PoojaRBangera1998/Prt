package com.testyantra.junit5_demo;

public class Message {
	private String message;
	
	public String getMessage() {
			message="This is the actual message!";
			return message;
	}
	public boolean updateMessage() {
		return false;
	}
	public boolean deleteMessage() {
		return false;
	}
}
