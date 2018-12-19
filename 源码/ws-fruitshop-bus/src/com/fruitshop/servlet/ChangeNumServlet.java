package com.fruitshop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fruitshop.fruit.service.Fruit;
import com.fruitshop.fruit.service.FruitServiceInterface;

public class ChangeNumServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fruitID = request.getParameter("fruitID");
		String num = request.getParameter("num");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		FruitServiceInterface fruitServiceInterface = (FruitServiceInterface) context.getBean("fruitServiceClient");

		Fruit fruit = null;
		try {
			fruit = fruitServiceInterface.findFruitByID(fruitID);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		HttpSession session = request.getSession();
		Map<Fruit, String> cart = (Map<Fruit, String>) session.getAttribute("cart");

		Iterator iter = cart.entrySet().iterator();

		while (iter.hasNext()) {
			Map.Entry entry = (Entry) iter.next();
			Fruit tempFruit = (Fruit) entry.getKey();
			if (tempFruit.getFruitID().equals(fruitID)) {

				// 如果数量为零，则删除对象
				if ("0".equals(num)) {

					cart.remove(tempFruit);
					break;

					// continue;
				}
				cart.put(tempFruit, num);// 若数量不为0,则覆盖
			}
		}
		try {
			request.getRequestDispatcher("/shoppingCart.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
