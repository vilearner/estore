package com.ibm.rho.estore.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class GetLastPageResponseWrapper {

	private LastPage response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public LastPage getResponse(){
            return response;
	}
 
	public void setResponse(LastPage response){
            this.response=response;
	} 
}
