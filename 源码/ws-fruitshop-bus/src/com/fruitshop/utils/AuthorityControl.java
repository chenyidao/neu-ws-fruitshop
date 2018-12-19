package com.fruitshop.utils;

import javax.servlet.http.HttpServletRequest;

import com.fruitshop.user.service.User;

public class AuthorityControl {
	public static boolean isLogin(HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		if (user != null) {
			return true;
		}
		return false;

	}
}
