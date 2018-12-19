package com.order.service;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

import com.order.pojo.Order;
import com.order.pojo.OrderItem;
import com.order.pojo.Order;

@WebService
@BindingType(SOAPBinding.SOAP12HTTP_BINDING) //  π”√SOAP1.2∞Ê±æ
public interface OrderServiceInterface {
	public void addOrder(Order order)throws Exception;
	public List<Order> findOrderByUserID(String userID)throws Exception;

}