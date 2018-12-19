package com.order.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.order.dao.OrderDaoInterface;
import com.order.dao.OrderItemDaoInterface;
import com.order.pojo.Order;
import com.order.pojo.OrderItem;
import com.order.util.C3P0Util;
import com.order.util.ManagerThreadLocal;

public class OrderItemDaoInterfaceImpl implements OrderItemDaoInterface {

	@Override
	public void addOrderItem(Order order) throws Exception {

		QueryRunner qr = new QueryRunner();
		Object[][] params = new Object[order.getOrderItems().size()][];

		for (int i = 0; i < params.length; i++) {
			params[i] = new Object[] { order.getOrderItems().get(i).getOrderItemID(),
					order.getOrderItems().get(i).getOrderItemQuantity(), order.getOrderItems().get(i).getOrderID(),
					order.getOrderItems().get(i).getFruitID() };
		}

		try {
			qr.batch(ManagerThreadLocal.getConnection(), "INSERT INTO orderItems VALUES(?,?,?,?)", params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
