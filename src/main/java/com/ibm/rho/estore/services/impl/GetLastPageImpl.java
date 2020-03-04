package com.ibm.rho.estore.services.impl;
 
import java.util.*;

import com.ibm.rho.estore.model.LastPage;
import com.ibm.rho.estore.model.LastPageRowMapper;
import com.ibm.rho.estore.services.GetLastPage;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;


 
@Service
public class GetLastPageImpl implements GetLastPage {
	private JdbcTemplate jdbcTemplateObject;
	
	public GetLastPageImpl(NamedParameterJdbcTemplate template) {  
	        this.template = template;  
	}  
	NamedParameterJdbcTemplate template;
 
    private static final Log logger = LogFactory.getLog(GetLastPageImpl.class);
   
   
	@Override
    public List<LastPage> findAllLastPageList(String customerid) {
		return template.query("select b.cart_id, b.itemid, p.productname, a.unit_price, b.quantity \n" + 
				"from product_inventy a, cart b, products P\n" + 
				"where a.item_id = b.itemid \n" + 
				"and p.productid = b.itemid \n" +
				"and b.customerid = '"+customerid+"'", new LastPageRowMapper());	
	}
	
	public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
	          
  }
