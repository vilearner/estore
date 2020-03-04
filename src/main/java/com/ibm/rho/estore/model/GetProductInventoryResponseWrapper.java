package com.ibm.rho.estore.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class GetProductInventoryResponseWrapper {

	private Item response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public Item getResponse(){
            return response;
	}
 
	public void setResponse(Item response){
            this.response=response;
	} 
}
