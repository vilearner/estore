package com.ibm.rho.estore.exception;

import java.util.HashMap;
import java.util.Map;

import com.ibm.rho.estore.exception.ApiExceptionResponse;
import com.ibm.rho.estore.exception.ErrorStatusCode;
import com.ibm.rho.estore.model.*;

public class MetaData {

	public static final Map<String,Map<ErrorStatusCode, ApiExceptionResponse>> apiExceptions;
	
	static {		
		apiExceptions = new HashMap<String,Map<ErrorStatusCode, ApiExceptionResponse>>();

		Map<ErrorStatusCode, ApiExceptionResponse> responses; 
		try {
		
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,Void.class,"Invalid item ID"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,Void.class,"Item Id not found"));
		 
		 apiExceptions.put("getProductInventory",responses);
		 
		
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}
