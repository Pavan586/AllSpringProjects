package com.ipl.loginregistration.entity;

public class LoginMessage {
	private String message;
	private boolean status;
	public LoginMessage(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	public LoginMessage() {
		super();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
