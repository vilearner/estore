package com.ibm.rho.estore.services.impl;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.ibm.rho.estore.model.GetProductInvInventoryP;
import com.ibm.rho.estore.model.GetProductInvInventoryResponseWrapper;
import com.ibm.rho.estore.model.InvItem;
import com.ibm.rho.estore.model.InvItemRowMapper;
import com.ibm.rho.estore.services.GetProductInventoryI;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.avro.data.Json;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class GetProductInventoryImpl implements GetProductInventoryI {
	
	public GetProductInventoryImpl(NamedParameterJdbcTemplate template) {  
	        this.template = template;  
	}  
	NamedParameterJdbcTemplate template;
 
    private static final Log logger = LogFactory.getLog(GetProductInventoryImpl.class);
   
    public GetProductInvInventoryResponseWrapper reliable(GetProductInvInventoryP pojo){ 
		//TODO
		return new GetProductInvInventoryResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public GetProductInvInventoryResponseWrapper execute(GetProductInvInventoryP requestParams){
        //TODO
        return new GetProductInvInventoryResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }

	@Override
	public void createProductInventory(InvItem item) {
		System.out.println("item list"+ item);
		final String sql = "insert into product_inventy(item_id,quantity,unit_price) values(:item_id,:quantity,:unit_price)";
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
			.addValue("item_id", item.getInvItem_id())
			.addValue("quantity", item.getQuantity())
			.addValue("unit_price", item.getUnit_price());
        template.update(sql,param, holder);
				
	}

	@Override
	public List<InvItem> findAll() {
		List<InvItem> productList = template.query("select * from product_inventy", new InvItemRowMapper());
		System.out.println("productList"+productList);
		for(InvItem product : productList)
		{
			if(Integer.parseInt(product.getQuantity()) > 5) {
				product.setQuantity("In-Stock");
			}
			else if(Integer.parseInt(product.getQuantity()) <= 0) {
				product.setQuantity("Temporarily Out of Stock");
			}
			else if(Integer.parseInt(product.getQuantity()) <= 5) {
				product.setQuantity("Hurry Few in Stock");
			}
			
			
		   // System.out.println(product);
		}
		return productList;
	}

	@Override
	public List<InvItem> findProductById(String item_id) {
		// TODO Auto-generated method stub
		return template.query("select * from product_inventy where item_id='"+item_id+"'", new InvItemRowMapper());
	}
	
	@Override
	public void updateProductInventory(InvItem item) {
		System.out.println("item list"+ item);
		Integer quantitysize = item.getQuantitySize() - 1 ;
		System.out.println("quantitysize"+quantitysize);
		final String sql = "update product_inventy set quantity = :quantity  where item_id= :item_id";
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
			.addValue("item_id", item.getInvItem_id())
			.addValue("quantity", quantitysize );
        template.update(sql,param, holder);
		
	}

	@Override
	public String readyStatus() throws Exception {
		 String url = "jdbc:postgresql://localhost:5432/postgres";
	     String username = "postgres";
	     String password = "admin";
	     String driver = "org.postgresql.Driver";
	     String output = "unable to established connection";
	     
	     Class.forName(driver);
	        Connection conn = DriverManager.getConnection(url, username, password);
	        try {
	            Statement statement = conn.createStatement();
	            ResultSet rs = statement.executeQuery("select current_timestamp from product_inventy limit 1;");
	            while(rs.next()) {
	                System.out.println("output"+rs.getObject(1));
	                output= "connection established....";
	            }
	        } finally {
	        	conn.close();
	        }
		return output;
	}
              
  }
