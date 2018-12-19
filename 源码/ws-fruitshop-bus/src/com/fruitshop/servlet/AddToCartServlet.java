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
		// ȡ�ù��ﳵ
		HttpSession session = request.getSession();
		Map<Fruit, String> cart = (Map<Fruit, String>) session.getAttribute("cart");
		int num = 1;
		// ����ǵ�һ�η��ʻ��߶����Ѿ��ύ����û�й��ﳵ����
		if (cart == null){		
			cart = new HashMap<Fruit, String>();
		}
		Iterator iter = cart.entrySet().iterator();
		while (iter.hasNext()) {
			// �鿴��ǰ�������Ƿ���ڸ�ˮ��������У�����++
			Entry entry = (Entry) iter.next();
			Fruit tempFruit = (Fruit) entry.getKey();	
			if (tempFruit.getFruitID().equals(fruitID)) {
				num = Integer.parseInt(cart.get(tempFruit)) + 1;
				cart.put(tempFruit, num + "");// ����
			}
		}
		if (num == 1) {// ��δ�ظ�
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
			FruitServiceInterface fruitServiceInterface = (FruitServiceInterface) context.getBean("fruitServiceClient");

			try {
				cart.put(fruitServiceInterface.findFruitByID(fruitID), num + "");
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
		session.setAttribute("cart", cart);// ���ǻ�����
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
