package com.ibm.rho.estore.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FirstPageRowMapper implements RowMapper<FirstPage> {
	

	@Override
	public FirstPage mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		FirstPage fp = new FirstPage();
		fp.setItem_id(rs.getString("item_id"));
		fp.setProductname(rs.getString("productname"));
		fp.setImage(rs.getString("imagelink"));
		fp.setProd_desc(rs.getString("productshortdesc"));
		fp.setUnit_price(rs.getFloat("unit_price"));
		fp.setStock(rs.getInt("quantity"));
		return fp;
	}

}	
