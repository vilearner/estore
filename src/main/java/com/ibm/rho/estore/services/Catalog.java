package com.ibm.rho.estore.services;

import java.util.List;

import com.ibm.rho.estore.model.GetProductCatalogP;
import com.ibm.rho.estore.model.GetProductCatalogResponseWrapper;
import com.ibm.rho.estore.model.Product;

public interface Catalog {
	
	

    public GetProductCatalogResponseWrapper execute(GetProductCatalogP requestParams);
    
    public void createProductCatalog(Product prod) ;
    public void deleteByProductId(String productid);
    public List<Product> findAllProducts();
    public List<Product> findByProductId(String productid);
    public String readyStatusCatalog() throws Exception;
    

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

	
}
