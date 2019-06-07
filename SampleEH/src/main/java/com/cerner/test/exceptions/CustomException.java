package com.cerner.test.exceptions;

public class CustomException extends Exception {

	
	private static final long serialVersionUID = 1L;

	private int errorCode;

	private String errorMessage;
	
	private CustomErrorResponse ceResponse;	
	
	public CustomException() {
	}
	public CustomException(CustomErrorResponse ceResponse) {
			this.ceResponse = ceResponse;
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

	
	public CustomErrorResponse getCeResponse() {
		return ceResponse;
	}
	public void setCeResponse(CustomErrorResponse ceResponse) {
		this.ceResponse = ceResponse;
	}
}
