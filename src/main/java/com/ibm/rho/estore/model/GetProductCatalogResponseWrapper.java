package com.ibm.rho.estore.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class GetProductCatalogResponseWrapper {

	private Product response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public Product getResponse(){
            return response;
	}
 
	public void setResponse(Product response){
            this.response=response;
	} 
}
