package com.user.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;


import com.user.dao.UserDaoInterface;
import com.user.pojo.User;
import com.user.util.C3P0Util;

public class UserDaoInterfaceImpl implements UserDaoInterface {

	@Override
	public User findUserByIDAndPassword(String userID, String userPassword) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("SELECT * FROM users WHERE userID=? AND userPassword=?", new BeanHandler<User>(User.class), userID,
				userPassword);
	}

	@Override
	public boolean addUser(User user) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		
		String sql = "INSERT INTO users(userID,userName,userPassword,userSex,userAddress,userPhoneNumber,userRole) VALUES(?,?,?,?,?,?,?);";
		qr.update(sql, user.getUserID(), user.getUserName(), user.getUserPassword(), user.getUserSex(),
				user.getUserAddress(), user.getUserPhoneNumber(),user.getUserRole());
		return true;
	}
	
}
