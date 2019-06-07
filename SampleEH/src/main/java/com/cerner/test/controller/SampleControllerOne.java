package com.cerner.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cerner.test.bean.RequestPrototypeOne;
import com.cerner.test.bean.ResponseProto;
import com.cerner.test.bean.RequestTransaction;
import com.cerner.test.exceptions.CustomException;
import com.cerner.test.service.ValidationService;

@RestController
public class SampleControllerOne {

	@Autowired
	ValidationService validationService;

	@GetMapping("/do")
	public String getFirstRequest() {
		return "Received Request";
	}

	@PostMapping("/submitRequest")
	public ResponseProto getReuestJson(@RequestBody RequestPrototypeOne request) throws CustomException {
		ResponseProto response = new ResponseProto();
		System.out.println(request);
		response = validationService.validateRequestData(request);
		return response;
	}

	@PostMapping("/patientRequest")
	public ResponseProto getPatientRequest(@RequestBody RequestTransaction request) throws CustomException {
		ResponseProto response = new ResponseProto();
		System.out.println(request);
		response = validationService.validateTransactionRequest(request);
		return response;
	}

}
