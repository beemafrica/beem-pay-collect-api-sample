package com.dp.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dp.api.constants.SystemConstants;
import com.dp.api.model.MessageDetail;
import com.dp.api.model.MessageDetailResponse;
import com.dp.api.model.ReceivedMessage;
import com.dp.api.model.AirtimeMessage;
import com.dp.api.model.ResponseMessage;
import com.dp.api.service.PaymentIntegrationService;


/**
 * PaymentController .
 * 
 * @author admin
 *
 */
@RestController
@CrossOrigin(exposedHeaders = "Content-Disposition")
public class PaymentController {

    Logger logger = LoggerFactory.getLogger(PaymentController.class);

    @Autowired
    private PaymentIntegrationService paymentIntegrationService;
    
    
	/**
	 * restApiCall.
	 *
	 * @param requestHeader the requestHeader
	 * @param request       the request
	 * @return ResponseEntity< CreateUserResponse >
	 * @throws Exception
	 */
	@RequestMapping(value = SystemConstants.Payment_CALLBACK, method = RequestMethod.POST)
	public ResponseEntity<PaymentDetailResponse> PaymentCallback(@RequestBody PaymentMessageDetail request) throws Exception {

		PaymentDetailResponse response = new PaymentDetailResponse();
		response.transaction_id=request.transaction_id;
		response.successful = true;
		
		
		return new ResponseEntity<>(response, HttpStatus.OK);

	}

}
