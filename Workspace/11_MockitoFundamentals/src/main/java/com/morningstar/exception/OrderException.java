package com.morningstar.exception;

import java.sql.SQLException;

public class OrderException extends Exception {

	public OrderException(SQLException e) {
		// TODO Auto-generated constructor stub
		super(e);
	}
	

}
