package com.ibm.rho.estore.api;

import com.ibm.rho.estore.model.Item;
import com.ibm.rho.estore.model.LastPage;
import com.ibm.rho.estore.model.Product;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import com.ibm.rho.estore.services.Cart;
import com.ibm.rho.estore.services.Catalog;
import com.ibm.rho.estore.services.GetFirstPage;
import com.ibm.rho.estore.services.GetLastPage;
import com.ibm.rho.estore.services.GetProductInventoryI;
import com.ibm.rho.estore.model.FirstPage;
import com.ibm.rho.estore.model.GetProductInvInventoryP;
import com.ibm.rho.estore.model.GetProductInvInventoryResponseWrapper;
import com.ibm.rho.estore.model.GetProductInventoryP;
import com.ibm.rho.estore.model.GetProductInventoryResponseWrapper;
import com.ibm.rho.estore.model.InvItem;

import org.springframework.beans.factory.annotation.Autowired;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-24T08:05:32.010Z")

@Controller
public class EstoreApiController implements CartApi, CatalogApi, InventoryApi, FirstPageApi {

	@Autowired
	Cart getProductCartI;
	
	@Autowired
	Catalog getProductCatalogI;
	
	@Autowired
	GetProductInventoryI getProductInventoryI;
	
	@Autowired
	GetFirstPage getEstoreFirstPage;
	
	@Autowired
	GetLastPage getEstoreLastPage;


    private static final Logger log = LoggerFactory.getLogger(EstoreApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EstoreApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

	/*
	 * public ResponseEntity<Item> getProductInventory(@ApiParam(value =
	 * "ID of product for which inventory details to be sent",required=
	 * true) @PathVariable("itemId") String itemId) {
	 * 
	 * GetProductInventoryResponseWrapper res = getProductCartI.execute(new
	 * GetProductInventoryP(itemId));
	 * 
	 * return new ResponseEntity<>(res.getResponse(),res.getHeaders(),
	 * HttpStatus.OK); }
	 */
    
    public ResponseEntity<String> createProductCart(@RequestBody Item item) {
    	//System.out.println("inventory list "+ item);
    getProductCartI.createProductCart(item);
    	return new ResponseEntity<>("save", HttpStatus.OK);
    }
    
    //public ResponseEntity<Collection<Item>> findAllProduct() {
    //    return new ResponseEntity<>(getProductCartI.findAll(), HttpStatus.OK);
    //}
    
 
    
    public ResponseEntity<String> getMessage() {
    	return new ResponseEntity<>("Welcome to eStore Cart Microservice...", HttpStatus.OK);
    	}

	@Override
	public ResponseEntity<String> deletByCustomerId(@PathVariable("customerid") String customerid) {
		System.out.println(customerid);
		getProductCartI.deletByCustomerId(customerid);
		return new ResponseEntity<>("delete by customerid", HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Collection<Item>> findByCustomerId(String customerid) {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(getProductCartI.findByCustomerId(customerid), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<String> deletebyItemId(String customerid, String itemid) {
		// TODO Auto-generated method stub
		getProductCartI.deletByItemrId(customerid,itemid);
		return new ResponseEntity<>("delete by itemid", HttpStatus.OK);
	}
	
	public ResponseEntity<String> readyStatus() throws Exception {
    	return new ResponseEntity<>(getProductCartI.readyStatus(), HttpStatus.OK);

	}
	
	
	
	// Catalog services  
	
	
	public ResponseEntity<String> createProductCatalog(@RequestBody Product prod) {
    	//System.out.println("products list "+ prod);
    getProductCatalogI.createProductCatalog(prod);
    	return new ResponseEntity<>("save", HttpStatus.OK);
    }
    
    public ResponseEntity<Collection<Product>> findAllCatalogProduct() {
        return new ResponseEntity<>(getProductCatalogI.findAllProducts(), HttpStatus.OK);
    }
    
    public ResponseEntity<String> getMessageCatalog() {
    	return new ResponseEntity<>("Welcome to eStore Catalog Microservice...", HttpStatus.OK);
    	}

	@Override
	public ResponseEntity<String> deletByProductId(@PathVariable("productid") String productid) {
		System.out.println(productid);
		getProductCatalogI.deleteByProductId(productid);
		return new ResponseEntity<>("delete by productid", HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Collection<Product>> findByProductId(String productid) {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(getProductCatalogI.findByProductId(productid), HttpStatus.OK);
	}

		
	public ResponseEntity<String> readyStatusCatalog() throws Exception {
    	return new ResponseEntity<>(getProductCatalogI.readyStatusCatalog(), HttpStatus.OK);

	}
	
	
	
	//Inventory..
	
	public ResponseEntity<InvItem> getProductInventory(@ApiParam(value = "ID of product for which inventory details to be sent",required=true) @PathVariable("itemId") String itemId) {
        
        GetProductInvInventoryResponseWrapper res  = getProductInventoryI.execute(new GetProductInvInventoryP(itemId));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
	} 
    
    public ResponseEntity<String> createProductInventory(@RequestBody InvItem item) {
    	//System.out.println("inventory list "+ item);
    getProductInventoryI.createProductInventory(item);
    	return new ResponseEntity<>("save", HttpStatus.OK);
    }
    
    public ResponseEntity<String> updateProductInventory(@RequestBody InvItem item) {
    	//System.out.println("inventory list "+ item);
    getProductInventoryI.updateProductInventory(item);
    	return new ResponseEntity<>("Update", HttpStatus.OK);
    }
    public ResponseEntity<Collection<InvItem>> findAllInvProduct() {
        return new ResponseEntity<>(getProductInventoryI.findAll(), HttpStatus.OK);
    }
    
    
    public ResponseEntity<Collection<InvItem>> findProductById( String item_id) {
        return new ResponseEntity<>(getProductInventoryI.findProductById(item_id), HttpStatus.OK);
    }
    
    public ResponseEntity<String> readyStatusInventory() throws Exception {
    	return new ResponseEntity<>(getProductInventoryI.readyStatus(), HttpStatus.OK);
    }
    
    //first page
    
    public ResponseEntity<Collection<FirstPage>> getFirstPage() {
        return new ResponseEntity<>(getEstoreFirstPage.findAllFirstPageList(), HttpStatus.OK);
    }
    
    //cart page
    
    public ResponseEntity<Collection<LastPage>> getLastPage(String customerid) {
        return new ResponseEntity<>(getEstoreLastPage.findAllLastPageList(customerid), HttpStatus.OK);
    }

}
