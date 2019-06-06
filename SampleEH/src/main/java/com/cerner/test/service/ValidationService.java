package com.cerner.test.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.cerner.test.bean.RequestPrototypeOne;
import com.cerner.test.bean.ResponseProto;
import com.cerner.test.exceptions.CustomException;
import com.cerner.test.util.ApplicationConstants;

@Service
public class ValidationService {

	public ResponseProto validateRequestData(RequestPrototypeOne request) throws CustomException {
		ResponseProto response = new ResponseProto();

		// Check various input parameters
		validateSubmittedData(request);

		response.setResponseCode("200");
		response.setResponseDetails("Form Submitted Successfully");
		response.setResponseStatus("OK");
		return response;
	}

	@SuppressWarnings("static-access")
	public void validateSubmittedData(RequestPrototypeOne request) throws CustomException {
		CustomException ce = new CustomException();

		String phoneNumber = "\\d{10}";
		String alphaNumeric = "\\w+";
		String pureText = "^[a-zA-Z]*$";

		if (request.getMaxLimitFiveK() > ApplicationConstants.MAXIMUM_PERMISSABLE_VALUE) {
			ce.setErrorCode(ApplicationConstants.MAXIMUM_VALUE_EXCEEDED_CODE);
			ce.setErrorMessage(
					ApplicationConstants.MAXIMUM_VALUE_EXCEEDED_MESSAGE + " - For input " + request.getMaxLimitFiveK());
			throw new CustomException(ce);
		} else if (request.getOnlyPastDate().compareTo(new Date()) > 0) {
			ce.setErrorCode(ApplicationConstants.PAST_DATE_REQUIRED_CODE);
			ce.setErrorMessage(
					ApplicationConstants.PAST_DATE_REQUIRED_MESSAGE + " - For input " + request.getOnlyPastDate());
			throw new CustomException(ce);
		} else if (request.getOnlyFutureDate().compareTo(new Date()) < 0) {
			ce.setErrorCode(ApplicationConstants.FUTURE_DATE_REQUIRED_CODE);
			ce.setErrorMessage(
					ApplicationConstants.FUTURE_DATE_REQUIRED_MESSAGE + " - For input " + request.getOnlyFutureDate());
			throw new CustomException(ce);
		} else if (!String.valueOf(request.getTenDigitPhoneNumber()).matches(phoneNumber)) {
			ce.setErrorCode(ApplicationConstants.INVALID_PHONE_NUMBER_CODE);
			ce.setErrorMessage(ApplicationConstants.INVALID_PHONE_NUMBER_MESSAGE + " - For input "
					+ request.getTenDigitPhoneNumber());
			throw new CustomException(ce);
		} else if (!request.getPureText().matches(pureText)) {
			ce.setErrorCode(ApplicationConstants.ALPHABETICAL_INPUT_VIOLATION_CODE);
			ce.setErrorMessage(ApplicationConstants.ALPHABETICAL_INPUT_VIOLATION_MESSAGE + " - For input "
					+ request.getPureText());
			throw new CustomException(ce);
		} else if (!request.getAlphaNumeric().matches(alphaNumeric)) {
			ce.setErrorCode(ApplicationConstants.ALPHANUMERIC_INPUT_VIOLATION_CODE);
			ce.setErrorMessage(ApplicationConstants.ALPHANUMERIC_INPUT_VIOLATION_MESSAGE + " - For input "
					+ request.getAlphaNumeric());
			throw new CustomException(ce);
		}
	}

}
