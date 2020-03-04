package com.ibm.rho.estore.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class InvItemRowMapper implements RowMapper<InvItem> {
	

	@Override
	public InvItem mapRow(ResultSet rs, int rowNum) throws SQLException {
		InvItem item = new InvItem();
		item.setInvItem_id(rs.getString("item_id"));
		item.setQuantity(rs.getString("quantity"));
		item.setUnit_price(rs.getFloat("unit_price"));
		item.setQuantitySize(rs.getInt("quantity"));
		return item;
	}

}	

