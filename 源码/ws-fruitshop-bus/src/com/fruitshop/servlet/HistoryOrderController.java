package com.fruitshop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fruitshop.order.service.Order;
import com.fruitshop.order.service.OrderItem;
import com.fruitshop.order.service.OrderServiceInterface;
import com.fruitshop.user.service.User;
import com.fruitshop.utils.AuthorityControl;



public class HistoryOrderController extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operationStr=request.getParameter("operationStr");
		if(operationStr.equals("findHistoryOrder")){
			findHistoryOrder(request,response);
		}
		
	}

	


	private void findHistoryOrder(HttpServletRequest request, HttpServletResponse response) {	
		List<Order> orders = null;
		try {		
			if(AuthorityControl.isLogin(request)==false){//如果未登录，则直接跳转到登录界面
				request.getRequestDispatcher("/login.jsp").forward(request, response);;	
			}
			User user = (User) request.getSession().getAttribute("user");
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
			OrderServiceInterface orderServiceInterface = (OrderServiceInterface) context.getBean("orderServiceClient");

			
			
			orders = orderServiceInterface.findOrderByUserID(user.getUserID());	
			request.getSession().setAttribute("orders", orders);
			request.getRequestDispatcher("/historyItem.jsp").forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
