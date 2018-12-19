package com.fruitshop.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fruitshop.user.service.User;
import com.fruitshop.user.service.UserServiceInterface;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userID = request.getParameter("userID");
		String userPassword = request.getParameter("userPassword");
		this.login(request, response,userID,userPassword);
	}

	public void login(HttpServletRequest request, HttpServletResponse response,String userID,String userPassword) throws ServletException, IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		UserServiceInterface userServiceInterface = (UserServiceInterface) context.getBean("userServiceClient");
		User user = userServiceInterface.login(userID, userPassword);
		
		if(null==user){
			request.setAttribute("msg_login","µ«¬º ß∞‹£¨’ ∫≈ªÚ√‹¬Î¥ÌŒÛ");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}else {
			request.getSession().setAttribute("user", user);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}	
	}

}
