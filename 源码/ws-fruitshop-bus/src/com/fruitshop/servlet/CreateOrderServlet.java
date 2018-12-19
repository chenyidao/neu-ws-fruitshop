package com.fruitshop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fruitshop.fruit.service.Fruit;
import com.fruitshop.order.service.Order;
import com.fruitshop.order.service.OrderItem;
import com.fruitshop.order.service.OrderServiceInterface;
import com.fruitshop.user.service.User;
import com.fruitshop.user.service.UserServiceInterface;

public class CreateOrderServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		Order order = new Order();
		try {
			BeanUtils.populate(order, request.getParameterMap());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssSSS");
			String dateStr = sdf.format(new Date());
			order.setOrderID(dateStr);
			order.setOrderPayState(0);// 初始化为未支付
			User user = (User) request.getSession().getAttribute("user");
			order.setUserID(user.getUserID());// User
			order.setOrderTime(dateStr.substring(0, 14));// 订单时间设置

		} catch (IllegalAccessException | InvocationTargetException e) {

			e.printStackTrace();
		}
		
		// 获得购物车session
		Map<Fruit, String> cart = (Map<Fruit, String>) request.getSession().getAttribute("cart");

		// 遍历购物车数据，创建OrderItem对象，并添加到orderItems中
		List<OrderItem> list = new ArrayList();
		OrderItem oi = null;
		int tempID = 1;
		for (Fruit f : cart.keySet()) {
			oi = new OrderItem();
			oi.setOrderID(order.getOrderID());
			
			oi.setFruitID(f.getFruitID());
			oi.setOrderItemQuantity(Integer.parseInt(cart.get(f)));
			oi.setOrderItemID(oi.getOrderID() + tempID);// 可设置为orderID+序号
			list.add(oi);
			tempID++;
		}

		// 先get再添加，nice
		order.getOrderItems().addAll(list);
		// order.setOrderItems(list);

		// 调用业务逻辑
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		OrderServiceInterface orderServiceInterface = (OrderServiceInterface) context.getBean("orderServiceClient");

		try {
			orderServiceInterface.addOrder(order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 订单提交成功后 销毁购物车
		if (cart != null)
			request.getSession().removeAttribute("cart");

		// 派发
		request.getRequestDispatcher("/index.jsp").forward(request, response);

	}

}
