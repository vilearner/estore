package com.ibm.rho.estore.services;

import java.util.List;

import com.ibm.rho.estore.model.LastPage;

public interface GetLastPage {
	
	
    public List<LastPage> findAllLastPageList(String customerid);
    
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

	
}
