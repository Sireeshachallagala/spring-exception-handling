package com.example.springexceptionhandling.model;

public class OrderError {

	private int errorCode;
	private String errorMessage;
	
	
	public OrderError() {
		
	}
	public OrderError(int errorCode, String errorMessage) {
		
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
}
