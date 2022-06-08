package com.morningstar.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.morningstar.dao.OrderDao;
import com.morningstar.exception.OrderException;
import com.morningstar.model.Order;
import com.morningstar.service.OrderServiceImpl;

public class OrderServiceImplTest {
	OrderServiceImpl target = null;
	Order order = null;
	@Mock
	OrderDao dao = null;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);

		target = new OrderServiceImpl();
		order = new Order();
		order.setId(1234);
		order.setStatus("confirm");

		target.setDao(dao);
	}

	@Test
	public void testPlaceOrderShouldSaveOrderInDatabaseAndReturnTrue() throws OrderException, SQLException {
		when(dao.create(order)).thenReturn(100);
		boolean result = target.placeOrder(order);
		assertTrue(result);
	}

}
