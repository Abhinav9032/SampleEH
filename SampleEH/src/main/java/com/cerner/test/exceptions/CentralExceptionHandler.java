package com.cerner.test.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CentralExceptionHandler {

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<CustomErrorResponse> getCustomException(CustomException ce) throws Exception {
		CustomErrorResponse ceResponse = new CustomErrorResponse();
		ceResponse.setErrorCode(ce.getErrorCode());
		ceResponse.setErrorDescription(ce.getErrorMessage());
		return new ResponseEntity<CustomErrorResponse>(ceResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
