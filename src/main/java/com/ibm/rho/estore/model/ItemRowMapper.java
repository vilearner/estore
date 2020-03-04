package com.ibm.rho.estore.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ItemRowMapper implements RowMapper<Item> {
	

	@Override
	public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Item item = new Item();
		item.setCart_id(rs.getString("cart_id"));
		item.setCustomerid(rs.getString("customerid"));
		item.setQuantity(rs.getInt("quantity"));
		item.setItemid(rs.getString("itemid"));
		return item;
	}

}	
