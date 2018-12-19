package com.fruitshop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet {

	// ×¢ÏúÊ¹ÓÃajax
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			request.getSession().invalidate();
		} catch (Exception e) {

		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.doGet(request, response);
	}

}
