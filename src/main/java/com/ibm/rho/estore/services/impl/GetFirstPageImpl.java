package com.ibm.rho.estore.services.impl;
 
import java.util.*;

import com.ibm.rho.estore.model.FirstPage;
import com.ibm.rho.estore.model.FirstPageRowMapper;
import com.ibm.rho.estore.services.GetFirstPage;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;


 
@Service
public class GetFirstPageImpl implements GetFirstPage {
	private JdbcTemplate jdbcTemplateObject;
	
	public GetFirstPageImpl(NamedParameterJdbcTemplate template) {  
	        this.template = template;  
	}  
	NamedParameterJdbcTemplate template;
 
    private static final Log logger = LogFactory.getLog(GetFirstPageImpl.class);
   
   
	@Override
    public List<FirstPage> findAllFirstPageList() {
		return template.query("select item_id, productname, imagelink, productshortdesc, unit_price, quantity from product_inventy, products\n" + 
				"where item_id = productid;", new FirstPageRowMapper());	
	}
	
	public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
	          
  }
