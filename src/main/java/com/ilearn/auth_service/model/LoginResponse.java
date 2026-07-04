package com.ilearn.auth_service.model;

public class LoginResponse {

	private int statusCode;
	private String message;
	private String token;

	public LoginResponse(){}
	
	public LoginResponse(int statusCode, String message, String token) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "LoginResponse [statusCode=" + statusCode + ", message=" + message + ", token=" + token + "]";
	}
	
}
