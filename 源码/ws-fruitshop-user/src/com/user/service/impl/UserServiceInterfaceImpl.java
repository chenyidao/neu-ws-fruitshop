package com.user.service.impl;

import java.sql.SQLException;

import com.user.dao.UserDaoInterface;
import com.user.dao.impl.UserDaoInterfaceImpl;
import com.user.pojo.User;
import com.user.service.UserServiceInterface;

/**
 * wsdl2java -p com.fruitshop.user.service -d .
 * http://127.0.0.1:8081/ws-fruitshop-user/ws/user?wsdl
 * 
 * @author Zain
 *
 */
public class UserServiceInterfaceImpl implements UserServiceInterface {

	UserDaoInterface userDaoInterface = new UserDaoInterfaceImpl();

	public User login(String userID, String userPassword) {
		User user = null;
		try {
			user = userDaoInterface.findUserByIDAndPassword(userID, userPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	public boolean regist(User user) {
		boolean bol = false;
		try {
			bol = userDaoInterface.addUser(user);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return bol;
	}

}
