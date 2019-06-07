package com.cerner.test.exceptions;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

@ControllerAdvice
public class CentralExceptionHandler {

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<CustomErrorResponse> getCustomException(CustomException ce) throws Exception {
		CustomErrorResponse ceResponse = new CustomErrorResponse();
		ceResponse = ce.getCeResponse();
		ceResponse.setErrorDescription(
				"Sorry your Submitted form contains " + ce.getCeResponse().getErrorList().size() + " error/s");
		return new ResponseEntity<CustomErrorResponse>(ce.getCeResponse(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(InvocationTargetException.class)
	ResponseEntity<CustomErrorResponse> getInvocationTargetExceptions(InvocationTargetException e) throws Exception {
		CustomErrorResponse ceResponse = new CustomErrorResponse();
		ceResponse.setErrorDescription(e.getMessage());
		ceResponse.setErrorList(new ArrayList<CustomExceptionBody>());
		return new ResponseEntity<CustomErrorResponse>(ceResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(InvalidFormatException.class)
	ResponseEntity<CustomErrorResponse> getInvalidFormatException(InvalidFormatException e) throws Exception {
		CustomErrorResponse ceResponse = new CustomErrorResponse();
		ceResponse.setErrorDescription(e.getMessage());
		ceResponse.setErrorList(new ArrayList<CustomExceptionBody>());
		return new ResponseEntity<CustomErrorResponse>(ceResponse, HttpStatus.NOT_ACCEPTABLE);
	}

	
	@ExceptionHandler(InvalidDefinitionException.class)
	ResponseEntity<CustomErrorResponse> getInvalidDefinitionException(InvalidDefinitionException e) throws Exception {
		CustomErrorResponse ceResponse = new CustomErrorResponse();
		ceResponse.setErrorDescription(e.getMessage());
		ceResponse.setErrorList(new ArrayList<CustomExceptionBody>());
		return new ResponseEntity<CustomErrorResponse>(ceResponse, HttpStatus.NOT_ACCEPTABLE);
	}
	
	
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	ResponseEntity<CustomErrorResponse> getHttpMessageNotReadableException(HttpMessageNotReadableException e)
			throws Exception {
		CustomErrorResponse ceResponse = new CustomErrorResponse();
		ceResponse.setErrorDescription(e.getMessage());
		ceResponse.setErrorList(new ArrayList<CustomExceptionBody>());
		return new ResponseEntity<CustomErrorResponse>(ceResponse, HttpStatus.NOT_ACCEPTABLE);
	}

	@ExceptionHandler(NullPointerException.class)
	ResponseEntity<CustomErrorResponse> getNullPointerException(NullPointerException e) throws Exception {
		CustomErrorResponse ceResponse = new CustomErrorResponse();
		ceResponse.setErrorDescription(e.initCause(e.getCause()).toString());
		ceResponse.setErrorList(new ArrayList<CustomExceptionBody>());
		return new ResponseEntity<CustomErrorResponse>(ceResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(Exception.class)
	ResponseEntity<CustomErrorResponse> getException(Exception e) throws Exception {
		CustomErrorResponse ceResponse = new CustomErrorResponse();
		ceResponse.setErrorDescription(e.initCause(e.getCause()).toString());
		ceResponse.setErrorList(new ArrayList<CustomExceptionBody>());
		return new ResponseEntity<CustomErrorResponse>(ceResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
