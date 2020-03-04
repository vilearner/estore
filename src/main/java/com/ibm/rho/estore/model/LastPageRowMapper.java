package com.ibm.rho.estore.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class LastPageRowMapper implements RowMapper<LastPage> {
	

	@Override
	public LastPage mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		LastPage fp = new LastPage();
		fp.setItem_id(rs.getString("itemid"));
		fp.setCart_id(rs.getString("cart_id"));
		fp.setProductname(rs.getString("productname"));
		fp.setUnit_price(rs.getFloat("unit_price"));
		fp.setQuantity(rs.getInt("quantity"));
		return fp;
	}

}	
