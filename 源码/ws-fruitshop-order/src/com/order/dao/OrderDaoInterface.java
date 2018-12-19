package com.order.dao;

import java.util.List;

import com.order.pojo.Order;

public interface OrderDaoInterface {
	public void addOrder(Order order) throws Exception;

	public List<Order> findOrderByUserID(String userID) throws Exception;
}
