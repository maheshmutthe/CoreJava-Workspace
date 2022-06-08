package com.morningstar.dao;

import java.sql.SQLException;

import com.morningstar.model.Order;

public interface OrderDao 
{
	public int create(Order order) throws SQLException;
	public Order read(int id) throws SQLException;
	public int update(Order order) throws SQLException;
	public int delete(int id) throws SQLException;
}
