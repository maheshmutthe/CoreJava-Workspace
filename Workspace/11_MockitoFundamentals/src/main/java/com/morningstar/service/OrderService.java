package com.morningstar.service;

import com.morningstar.exception.OrderException;
import com.morningstar.model.Order;

public interface OrderService {
	public boolean placeOrder(Order order) throws OrderException;
	public boolean cancelOrder(int id) throws OrderException;
	public boolean deleteOrder(int id) throws OrderException;
}
