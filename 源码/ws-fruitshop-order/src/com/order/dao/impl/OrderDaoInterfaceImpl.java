package com.order.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.order.dao.OrderDaoInterface;
import com.order.pojo.Order;
import com.order.util.C3P0Util;
import com.order.util.ManagerThreadLocal;

public class OrderDaoInterfaceImpl implements OrderDaoInterface {

	@Override
	public void addOrder(Order order) throws Exception {
		QueryRunner qr = new QueryRunner();

		String orderdeliveryTime = order.getOrderDeliveryTime().replace("[^0-9]", "");

		try {
			qr.update(ManagerThreadLocal.getConnection(), "INSERT INTO orders VALUES(?,?,?,?,?,?,?,?,?);",
					order.getOrderID(), order.getUserID(), order.getOrderTime(), orderdeliveryTime,
					order.getOrderDeliveryAddress(), order.getOrderDeliveryName(), order.getOrderDeliveryPhoneNumber(),
					order.getOrderMoney(), order.getOrderPayState());

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

	@Override
	public List<Order> findOrderByUserID(String userID) throws Exception {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from orders where userID=?", new BeanListHandler<Order>(Order.class), userID);
	}

	

}
