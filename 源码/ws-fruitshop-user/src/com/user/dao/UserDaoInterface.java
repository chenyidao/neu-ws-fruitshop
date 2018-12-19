package com.user.dao;

import java.sql.SQLException;

import com.user.pojo.User;

public interface UserDaoInterface {
	public User findUserByIDAndPassword(String userID, String userPassword)throws SQLException;
	public boolean addUser(User user) throws SQLException;

}
