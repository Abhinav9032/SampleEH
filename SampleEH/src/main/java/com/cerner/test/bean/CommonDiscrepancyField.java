package com.cerner.test.bean;

public class CommonDiscrepancyField {
	
	private String responseValue;
	
	private String userAction;

	public String getResponseValue() {
		return responseValue;
	}

	public void setResponseValue(String responseValue) {
		this.responseValue = responseValue;
	}

	public String getUserAction() {
		return userAction;
	}

	public void setUserAction(String userAction) {
		this.userAction = userAction;
	}

	public CommonDiscrepancyField(String responseValue, String userAction) {
		this.responseValue = responseValue;
		this.userAction = userAction;
	}

	@Override
	public String toString() {
		return "CommonDiscrepancyField [responseValue=" + responseValue + ", userAction=" + userAction + "]";
	}
	
	
	
}
