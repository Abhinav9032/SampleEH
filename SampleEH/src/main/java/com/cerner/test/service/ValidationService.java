package com.cerner.test.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.cerner.test.bean.RequestPrototypeOne;
import com.cerner.test.bean.RequestTransaction;
import com.cerner.test.bean.ResponseProto;
import com.cerner.test.exceptions.CustomErrorResponse;
import com.cerner.test.exceptions.CustomException;
import com.cerner.test.exceptions.CustomExceptionBody;
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

	public ResponseProto validateTransactionRequest(RequestTransaction request) throws CustomException {
		ResponseProto response = new ResponseProto();
		// Check various transaction parameters
		validateSubmittedTransactionRequest(request);
		response.setResponseCode(HttpStatus.OK + "");
		response.setResponseDetails("Transaction request Submitted Successfully");
		response.setResponseStatus("OK");
		return response;
	}

	private void validateSubmittedTransactionRequest(RequestTransaction request) throws CustomException {
		CustomErrorResponse ceResponse = new CustomErrorResponse();
		CustomExceptionBody ce;
		ArrayList<CustomExceptionBody> errorList = new ArrayList<CustomExceptionBody>();

		String alphabetsWithSpaces = "^[a-zA-Z ]*$";
		String dateOfEightFields = "\\d{8}";
		String onlyDigits = "\\d";
		String pureText = "^[a-zA-Z]*$";
		String boolVal[] = { "TRUE", "FALSE" };

		String typeCode = request.getTransactions().get(0).getIdentifiers().get(0).getTypeCode();
		int value = request.getTransactions().get(0).getIdentifiers().get(0).getValue();
		String modifyModeIndicator = request.getTransactions().get(0).getModifyModeIndicator();
		String payerName = request.getTransactions().get(0).getPayerName();
		String healthPlanName = request.getTransactions().get(0).getHealthPlanName();
		String lastNameOnPolicy = request.getTransactions().get(0).getPatient().getLastNameOnPolicy();
		String firstNameOnPolicy = request.getTransactions().get(0).getPatient().getFirstNameOnPolicy();
		String birthDateOnPolicy = request.getTransactions().get(0).getPatient().getBirthDateOnPolicy();
		String genderCodeOnPolicy = request.getTransactions().get(0).getPatient().getGenderCodeOnPolicy();

		if (!typeCode.matches(pureText)) {
			ce = new CustomExceptionBody();
			ce.setErrorCode(ApplicationConstants.ALPHABETICAL_INPUT_VIOLATION_CODE);
			ce.setErrorMessage(ApplicationConstants.ALPHABETICAL_INPUT_VIOLATION_MESSAGE + " - For input " + typeCode);
			errorList.add(ce);
		}
		if (typeCode.length() < 3) {
			ce = new CustomExceptionBody();
			ce.setErrorCode(ApplicationConstants.MINIMUM_LENGTH_CONSTRAINT_VIOLATION_CODE);
			ce.setErrorMessage(
					ApplicationConstants.MINIMUM_LENGTH_CONSTRAINT_VIOLATION_MESSAGE + " - For input " + typeCode);
			errorList.add(ce);
		}
		if (String.valueOf(value).matches(onlyDigits)) {
			ce = new CustomExceptionBody();
			ce.setErrorCode(ApplicationConstants.NUMERIC_INPUT_VIOLATION_CODE);
			ce.setErrorMessage(ApplicationConstants.NUMERIC_INPUT_VIOLATION_MESSAGE + " - For input " + value);
			errorList.add(ce);
		}
		if (!Arrays.asList(boolVal).contains(modifyModeIndicator)) {
			ce = new CustomExceptionBody();
			ce.setErrorCode(ApplicationConstants.BOOLEAN_INPUT_VIOLATION_CODE);
			ce.setErrorMessage(
					ApplicationConstants.BOOLEAN_INPUT_VIOLATION_MESSAGE + " - For input " + modifyModeIndicator);
			errorList.add(ce);
		}
		if (!payerName.matches(pureText)) {
			ce = new CustomExceptionBody();
			ce.setErrorCode(ApplicationConstants.ALPHABETICAL_INPUT_VIOLATION_CODE);
			ce.setErrorMessage(ApplicationConstants.ALPHABETICAL_INPUT_VIOLATION_MESSAGE + " - For input " + payerName);
			errorList.add(ce);
		}
		if (payerName.length() < 3) {
			ce = new CustomExceptionBody();
			ce.setErrorCode(ApplicationConstants.MINIMUM_LENGTH_CONSTRAINT_VIOLATION_CODE);
			ce.setErrorMessage(
					ApplicationConstants.MINIMUM_LENGTH_CONSTRAINT_VIOLATION_MESSAGE + " - For input " + payerName);
			errorList.add(ce);
		}
		if (!healthPlanName.matches(alphabetsWithSpaces)) {
			ce = new CustomExceptionBody();
			ce.setErrorCode(ApplicationConstants.ALPHABETICAL_INPUT_VIOLATION_CODE);
			ce.setErrorMessage(
					ApplicationConstants.ALPHABETICAL_INPUT_VIOLATION_MESSAGE + " - For input " + healthPlanName);
			errorList.add(ce);
		}
		if (healthPlanName.length() < 3) {
			ce = new CustomExceptionBody();
			ce.setErrorCode(ApplicationConstants.MINIMUM_LENGTH_CONSTRAINT_VIOLATION_CODE);
			ce.setErrorMessage(ApplicationConstants.MINIMUM_LENGTH_CONSTRAINT_VIOLATION_MESSAGE + " - For input "
					+ healthPlanName);
			errorList.add(ce);
		}
		if (!lastNameOnPolicy.matches(pureText)) {
			ce = new CustomExceptionBody();
			ce.setErrorCode(ApplicationConstants.ALPHABETICAL_INPUT_VIOLATION_CODE);
			ce.setErrorMessage(
					ApplicationConstants.ALPHABETICAL_INPUT_VIOLATION_MESSAGE + " - For input " + lastNameOnPolicy);
			errorList.add(ce);
		}
		if (!firstNameOnPolicy.matches(pureText)) {
			ce = new CustomExceptionBody();
			ce.setErrorCode(ApplicationConstants.ALPHABETICAL_INPUT_VIOLATION_CODE);
			ce.setErrorMessage(
					ApplicationConstants.ALPHABETICAL_INPUT_VIOLATION_MESSAGE + " - For input " + firstNameOnPolicy);
			errorList.add(ce);
		}
		if (firstNameOnPolicy.length() < 3) {
			ce = new CustomExceptionBody();
			ce.setErrorCode(ApplicationConstants.MINIMUM_LENGTH_CONSTRAINT_VIOLATION_CODE);
			ce.setErrorMessage(ApplicationConstants.MINIMUM_LENGTH_CONSTRAINT_VIOLATION_MESSAGE + " - For input "
					+ firstNameOnPolicy);
			errorList.add(ce);
		}
		if (!birthDateOnPolicy.matches(dateOfEightFields)) {
			ce = new CustomExceptionBody();
			ce.setErrorCode(ApplicationConstants.MINIMUM_LENGTH_CONSTRAINT_VIOLATION_CODE);
			ce.setErrorMessage(ApplicationConstants.MINIMUM_LENGTH_CONSTRAINT_VIOLATION_DATE_MESSAGE + " - For input "
					+ birthDateOnPolicy);
			errorList.add(ce);
		}
		if (!genderCodeOnPolicy.matches(pureText)) {
			ce = new CustomExceptionBody();
			ce.setErrorCode(ApplicationConstants.ALPHABETICAL_INPUT_VIOLATION_CODE);
			ce.setErrorMessage(
					ApplicationConstants.ALPHABETICAL_INPUT_VIOLATION_MESSAGE + " - For input " + genderCodeOnPolicy);
			errorList.add(ce);
		}
		if (genderCodeOnPolicy.length() < 4) {
			ce = new CustomExceptionBody();
			ce.setErrorCode(ApplicationConstants.MINIMUM_LENGTH_CONSTRAINT_VIOLATION_CODE);
			ce.setErrorMessage(ApplicationConstants.MINIMUM_LENGTH_CONSTRAINT_VIOLATION_MESSAGE + " - For input "
					+ genderCodeOnPolicy);
			errorList.add(ce);
		}

		if (errorList.size() > 0) {
			ceResponse.setErrorList(errorList);
			throw new CustomException(ceResponse);
		}
	}

	@SuppressWarnings("static-access")
	public void validateSubmittedData(RequestPrototypeOne request) throws CustomException {
		CustomErrorResponse ceResponse = new CustomErrorResponse();
		CustomExceptionBody ce;
		ArrayList<CustomExceptionBody> errorList = new ArrayList<CustomExceptionBody>();
		String phoneNumber = "\\d{10}";
		String alphaNumeric = "\\w+";
		String pureText = "^[a-zA-Z]*$";

		if (request.getMaxLimitFiveK() > ApplicationConstants.MAXIMUM_PERMISSABLE_VALUE) {
			ce = new CustomExceptionBody();
			ce.setErrorCode(ApplicationConstants.MAXIMUM_VALUE_EXCEEDED_CODE);
			ce.setErrorMessage(
					ApplicationConstants.MAXIMUM_VALUE_EXCEEDED_MESSAGE + " - For input " + request.getMaxLimitFiveK());
			errorList.add(ce);
		}
		if (request.getOnlyPastDate().compareTo(new Date()) > 0) {
			ce = new CustomExceptionBody();
			ce.setErrorCode(ApplicationConstants.PAST_DATE_REQUIRED_CODE);
			ce.setErrorMessage(
					ApplicationConstants.PAST_DATE_REQUIRED_MESSAGE + " - For input " + request.getOnlyPastDate());
			errorList.add(ce);
		}
		if (request.getOnlyFutureDate().compareTo(new Date()) < 0) {
			ce = new CustomExceptionBody();
			ce.setErrorCode(ApplicationConstants.FUTURE_DATE_REQUIRED_CODE);
			ce.setErrorMessage(
					ApplicationConstants.FUTURE_DATE_REQUIRED_MESSAGE + " - For input " + request.getOnlyFutureDate());
			errorList.add(ce);
		}
		if (!String.valueOf(request.getTenDigitPhoneNumber()).matches(phoneNumber)) {
			ce = new CustomExceptionBody();
			ce.setErrorCode(ApplicationConstants.INVALID_PHONE_NUMBER_CODE);
			ce.setErrorMessage(ApplicationConstants.INVALID_PHONE_NUMBER_MESSAGE + " - For input "
					+ request.getTenDigitPhoneNumber());
			errorList.add(ce);
		}
		if (!request.getPureText().matches(pureText)) {
			ce = new CustomExceptionBody();
			ce.setErrorCode(ApplicationConstants.ALPHABETICAL_INPUT_VIOLATION_CODE);
			ce.setErrorMessage(ApplicationConstants.ALPHABETICAL_INPUT_VIOLATION_MESSAGE + " - For input "
					+ request.getPureText());
			errorList.add(ce);
		}
		if (!request.getAlphaNumeric().matches(alphaNumeric)) {
			ce = new CustomExceptionBody();
			ce.setErrorCode(ApplicationConstants.ALPHANUMERIC_INPUT_VIOLATION_CODE);
			ce.setErrorMessage(ApplicationConstants.ALPHANUMERIC_INPUT_VIOLATION_MESSAGE + " - For input "
					+ request.getAlphaNumeric());
			errorList.add(ce);
		}

		if (errorList.size() > 0) {
			ceResponse.setErrorList(errorList);
			throw new CustomException(ceResponse);
		}

	}

}
