package com.user.service;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

import com.user.pojo.User;

@WebService
@BindingType(SOAPBinding.SOAP12HTTP_BINDING) //  π”√SOAP1.2∞Ê±æ
public interface UserServiceInterface {
	public User login(String userID, String userPassword);

	public boolean regist(User user);
}



