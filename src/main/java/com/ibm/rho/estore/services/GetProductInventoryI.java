package com.ibm.rho.estore.services;

import java.util.List;

import com.ibm.rho.estore.model.GetProductInvInventoryP;
import com.ibm.rho.estore.model.GetProductInvInventoryResponseWrapper;
import com.ibm.rho.estore.model.InvItem;

public interface GetProductInventoryI {
	
	

    public GetProductInvInventoryResponseWrapper execute(GetProductInvInventoryP requestParams);
    
    public void createProductInventory(InvItem item) ;
    public List<InvItem> findAll();
    public List<InvItem> findProductById(String item_id);
    public void updateProductInventory(InvItem item) ;
    public String readyStatus() throws Exception;
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
