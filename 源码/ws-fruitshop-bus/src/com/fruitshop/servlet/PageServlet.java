package com.fruitshop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fruitshop.fruit.service.FruitPageBean;
import com.fruitshop.fruit.service.FruitServiceInterface;



public class PageServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ��ʼ��ÿҳ��ʾ�ļ�¼��(��ʱ����ҳ)
		int pageSize = 6;
		int currentPage = 1;// ��ǰҳ
		String currPage = request.getParameter("currentPage");
		if (currPage != null && !"".equals(currPage)) {// ��һ�η�����Դʱ��currPage������null
			currentPage = Integer.parseInt(currPage);
		}
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		FruitServiceInterface fruitServiceInterface = (FruitServiceInterface) context.getBean("fruitServiceClient");	
		FruitPageBean fpb = null;
		try {
			fpb = fruitServiceInterface.findFruitPage(currentPage, pageSize);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		request.setAttribute("fpb", fpb);
		request.getRequestDispatcher("/fruitList.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);

	}

}
