package com.ibm.rho.estore.services;

import java.util.List;

import com.ibm.rho.estore.model.FirstPage;

public interface GetFirstPage {
	
	
    public List<FirstPage> findAllFirstPageList();
    
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

	
}
