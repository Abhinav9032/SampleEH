package com.cerner.test.exceptions;

public class CustomException extends Exception {

	private int errorCode;

	private String errorMessage;

	public CustomException() {
	}

	public CustomException(CustomException ce) {
		this.errorCode = ce.getErrorCode();
		this.errorMessage = ce.getErrorMessage();
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
