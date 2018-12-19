package com.fruitshop.servlet;

import java.io.IOException;
import java.util.HashMap;
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

public class AddToCartServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fruitID = request.getParameter("fruitID");
		// 取得购物车
		HttpSession session = request.getSession();
		Map<Fruit, String> cart = (Map<Fruit, String>) session.getAttribute("cart");
		int num = 1;
		// 如果是第一次访问或者订单已经提交，则没有购物车对象
		if (cart == null){		
			cart = new HashMap<Fruit, String>();
		}
		Iterator iter = cart.entrySet().iterator();
		while (iter.hasNext()) {
			// 查看当前集合中是否存在该水果，如果有，数据++
			Entry entry = (Entry) iter.next();
			Fruit tempFruit = (Fruit) entry.getKey();	
			if (tempFruit.getFruitID().equals(fruitID)) {
				num = Integer.parseInt(cart.get(tempFruit)) + 1;
				cart.put(tempFruit, num + "");// 覆盖
			}
		}
		if (num == 1) {// 则未重复
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
			FruitServiceInterface fruitServiceInterface = (FruitServiceInterface) context.getBean("fruitServiceClient");

			try {
				cart.put(fruitServiceInterface.findFruitByID(fruitID), num + "");
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
		session.setAttribute("cart", cart);// 覆盖或增加
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
