package com.ibm.rho.estore.services;

import java.util.List;

import com.ibm.rho.estore.model.GetProductInventoryP;
import com.ibm.rho.estore.model.GetProductInventoryResponseWrapper;
import com.ibm.rho.estore.model.Item;

public interface Cart {
	
	

    public GetProductInventoryResponseWrapper execute(GetProductInventoryP requestParams);
    
    public void createProductCart(Item item) ;
    public void deletByCustomerId(String customerid);
    //public List<Item> findAll();
    public List<Item> findByCustomerId(String customerid);
    public String readyStatus() throws Exception;
    

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

	public void deletByItemrId(String customerid, String itemid);

}
