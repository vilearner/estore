package com.ibm.rho.estore.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class GetFirstPageResponseWrapper {

	private FirstPage response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public FirstPage getResponse(){
            return response;
	}
 
	public void setResponse(FirstPage response){
            this.response=response;
	} 
}
