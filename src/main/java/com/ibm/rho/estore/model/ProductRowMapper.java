package com.ibm.rho.estore.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductRowMapper implements RowMapper<Product> {
	

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Product prod = new Product();
		prod.setproductId(rs.getString("productId"));
		prod.setproductName(rs.getString("productName"));
		prod.setpartNo(rs.getString("partNo"));
		prod.setimageLink(rs.getString("imageLink"));
		prod.setproductShortDesc(rs.getString("productShortDesc"));
		return prod;
	}

}	
