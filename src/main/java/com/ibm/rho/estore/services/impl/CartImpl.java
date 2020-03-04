package com.ibm.rho.estore.services.impl;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
 
import com.ibm.rho.estore.model.GetProductInventoryP;
import com.ibm.rho.estore.model.GetProductInventoryResponseWrapper;
import com.ibm.rho.estore.model.Item;
import com.ibm.rho.estore.model.ItemRowMapper;
import com.ibm.rho.estore.services.Cart;

import org.springframework.jdbc.core.JdbcTemplate;
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
public class CartImpl implements Cart {
	private JdbcTemplate jdbcTemplateObject;
	
	public CartImpl(NamedParameterJdbcTemplate template) {  
	        this.template = template;  
	}  
	NamedParameterJdbcTemplate template;
 
    private static final Log logger = LogFactory.getLog(CartImpl.class);
   
    public GetProductInventoryResponseWrapper reliable(GetProductInventoryP pojo){ 
		//TODO
		return new GetProductInventoryResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public GetProductInventoryResponseWrapper execute(GetProductInventoryP requestParams){
        //TODO
        return new GetProductInventoryResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }

	@Override
	public void createProductCart(Item item) {
		System.out.println("item list"+ item);
		final String sql = "insert into cart(cart_id,customerid,itemid,quantity) values(:cart_id,:customerid,:itemid ,:quantity)";
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
			.addValue("cart_id", item.getCart_id())
			.addValue("customerid", item.getCustomerid())
			.addValue("itemid", item.getItemid())
			.addValue("quantity", item.getQuantity());
        template.update(sql,param, holder);
				
	}

	//@Override
	//public List<Item> findAll() {
	//	return template.query("select * from product_inventy", new ItemRowMapper());
	//}

	@Override
	public List<Item> findByCustomerId(String customerid) {
		// TODO Auto-generated method stub
		return template.query("select * from cart where customerid='"+customerid+"'", new ItemRowMapper());
	}

	@Override
	public void deletByCustomerId(String customerid) {
		System.out.print("customerid "+ customerid);
		String SQL = "delete from cart where customerid = :customerid";
		SqlParameterSource namedParameters = new MapSqlParameterSource("customerid", String.valueOf(customerid));
		template.update(SQL, namedParameters);
        System.out.println("Deleted Record with customerid = " + customerid );
			
	}

	@Override
	public void deletByItemrId(String customerid, String itemid) {
		String SQL = "delete from cart where customerid = :customerid and itemid = :itemid ";
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("customerid", String.valueOf(customerid))
				.addValue("itemid", String.valueOf(itemid));

		//SqlParameterSource namedParameters = new MapSqlParameterSource("customerid", String.valueOf(customerid));
		template.update(SQL, namedParameters);
        System.out.println("Deleted Record with customerid = " + customerid );
		
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
