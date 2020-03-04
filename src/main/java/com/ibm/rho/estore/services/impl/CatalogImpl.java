package com.ibm.rho.estore.services.impl;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import com.ibm.rho.estore.model.GetProductCatalogP;
import com.ibm.rho.estore.model.GetProductCatalogResponseWrapper;
import com.ibm.rho.estore.model.Product;
import com.ibm.rho.estore.model.ProductRowMapper;
import com.ibm.rho.estore.services.Catalog;

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
public class CatalogImpl implements Catalog {
	private JdbcTemplate jdbcTemplateObject;
	
	public CatalogImpl(NamedParameterJdbcTemplate template) {  
	        this.template = template;  
	}  
	NamedParameterJdbcTemplate template;
 
    private static final Log logger = LogFactory.getLog(CatalogImpl.class);
   
    public GetProductCatalogResponseWrapper reliable(GetProductCatalogP pojo){ 
		//TODO
		return new GetProductCatalogResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public GetProductCatalogResponseWrapper execute(GetProductCatalogP requestParams){
        //TODO
        return new GetProductCatalogResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }

	@Override
	public void createProductCatalog(Product prod) {
		System.out.println("product list"+ prod);
		final String sql = "insert into catalog(productId,productName,partNo,imageLink,productShortDesc) values(:productId,:productName,:partNo ,:imageLink,:productShortDesc)";
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
			.addValue("productId", prod.getproductId())
			.addValue("productName", prod.getproductName())
			.addValue("partNo", prod.getpartNo())
			.addValue("imageLink", prod.getimageLink())
			.addValue("productShortDesc", prod.getproductShortDesc());
        template.update(sql,param, holder);
				
	}

	@Override
	public List<Product> findAllProducts() {
		return template.query("select * from products", new ProductRowMapper());
	}

	@Override
	public List<Product> findByProductId(String productid) {
		// TODO Auto-generated method stub
		return template.query("select * from products where productId='"+productid+"'", new ProductRowMapper());
	}

	@Override
	public void deleteByProductId(String productid) {
		System.out.print("productid "+ productid);
		String SQL = "delete from cart where customerid = :customerid";
		SqlParameterSource namedParameters = new MapSqlParameterSource("customerid", String.valueOf(productid));
		template.update(SQL, namedParameters);
        System.out.println("Deleted Record with customerid = " + productid );
			
	}

		
	@Override
	public String readyStatusCatalog() throws Exception {
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
