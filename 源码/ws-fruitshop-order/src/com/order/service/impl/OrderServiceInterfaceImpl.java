package com.order.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fruit.service2.FruitServiceInterface2;
import com.fruit.service2.UpdateEntry;
import com.order.dao.OrderDaoInterface;
import com.order.dao.OrderItemDaoInterface;
import com.order.dao.impl.OrderDaoInterfaceImpl;
import com.order.dao.impl.OrderItemDaoInterfaceImpl;
import com.order.pojo.Order;
import com.order.pojo.OrderItem;
import com.order.service.OrderServiceInterface;
import com.order.util.ManagerThreadLocal;

/**
 * @author Zain(zy)
 */
public class OrderServiceInterfaceImpl implements OrderServiceInterface {
	OrderDaoInterface orderDaoInterface = new OrderDaoInterfaceImpl();
	OrderItemDaoInterface orderItemDaoInterface = new OrderItemDaoInterfaceImpl();

	@Override
	public void addOrder(Order order) throws Exception {

		try {
			ManagerThreadLocal.startTransacation();
			orderDaoInterface.addOrder(order);
			orderItemDaoInterface.addOrderItem(order);

			ArrayList<UpdateEntry> entryList = new ArrayList<UpdateEntry>();
			for (int i = 0; i < order.getOrderItems().size(); i++) {
				UpdateEntry entry = new UpdateEntry();
				entry.setKey(order.getOrderItems().get(i).getFruitID());
				entry.setValue(order.getOrderItems().get(i).getOrderItemQuantity());
				entryList.add(entry);
			}

			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
			FruitServiceInterface2 fruitServiceInterface2 = (FruitServiceInterface2) context
					.getBean("fruitServiceClient2");

			ManagerThreadLocal.commit();
			fruitServiceInterface2.updateReserve(entryList);
			
		} catch (Exception e) {
			ManagerThreadLocal.rollback();
			throw new Exception("Ìá½»¶©µ¥Ê§°Ü£¡");
		}

	}

	@Override
	public List<Order> findOrderByUserID(String userID) throws Exception {
		try {
			return orderDaoInterface.findOrderByUserID(userID);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;

	}

}
