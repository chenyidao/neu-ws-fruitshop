package com.fruitshop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fruitshop.user.service.User;
import com.fruitshop.user.service.UserServiceInterface;

public class SignupServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		try {
			BeanUtils.populate(user, request.getParameterMap());

		} catch (IllegalAccessException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("regist_msg", "×¢²áÊ§°Ü");
			request.getRequestDispatcher("/signup.jsp").forward(request, response);
		} catch (InvocationTargetException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("regist_msg", "×¢²áÊ§°Ü");
			request.getRequestDispatcher("/signup.jsp").forward(request, response);
		}
		this.signup(request, response, user);
	}

	public void signup(HttpServletRequest request, HttpServletResponse response, User user)
			throws ServletException, IOException {

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		UserServiceInterface userServiceInterface = (UserServiceInterface) context.getBean("userServiceClient");
		boolean bol = userServiceInterface.regist(user);

		if (true == bol) {
			request.getSession().setAttribute("user", user);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} else {
			request.setAttribute("regist_msg", "×¢²áÊ§°Ü");
			request.getRequestDispatcher("/signup.jsp").forward(request, response);
		}
	}

}
