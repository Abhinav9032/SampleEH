package com.cerner.test.exceptions;

import java.util.ArrayList;

public class CustomErrorResponse {

	private String errorDescription;
	private ArrayList<CustomExceptionBody> errorList;
	
	
	
	public ArrayList<CustomExceptionBody> getErrorList() {
		return errorList;
	}

	public void setErrorList(ArrayList<CustomExceptionBody> errorList) {
		this.errorList = errorList;
	}

	
	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

}
