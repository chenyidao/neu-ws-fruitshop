package com.order.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Order") // 可以实现对象和XML数据之间的转换
public class Order {
	private String orderID;
	private String orderTime;// set()方法中需要转换格式
	private String orderDeliveryTime;
	private String orderDeliveryAddress;
	private String orderDeliveryPhoneNumber;
	private String orderDeliveryName;
	private int orderPayState;
	private float orderMoney;
	private List<OrderItem> orderItems;
	private String userID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getOrderDeliveryPhoneNumber() {
		return orderDeliveryPhoneNumber;
	}

	public void setOrderDeliveryPhoneNumber(String orderDeliveryPhoneNumber) {
		this.orderDeliveryPhoneNumber = orderDeliveryPhoneNumber;
	}

	public String getOrderDeliveryName() {
		return orderDeliveryName;
	}

	public void setOrderDeliveryName(String orderDeliveryName) {
		this.orderDeliveryName = orderDeliveryName;
	}

	public String getOrderDeliveryAddress() {
		return orderDeliveryAddress;
	}

	public void setOrderDeliveryAddress(String orderDeliveryAddress) {
		this.orderDeliveryAddress = orderDeliveryAddress;
	}

	public String getOrderDeliveryTime() {
		return orderDeliveryTime;
	}

	public void setOrderDeliveryTime(String orderDeliveryTime) {
		this.orderDeliveryTime = orderDeliveryTime;
	}

	public int getOrderPayState() {
		return orderPayState;
	}

	public void setOrderPayState(int orderPayState) {
		this.orderPayState = orderPayState;
	}

	public float getOrderMoney() {
		return orderMoney;
	}

	public void setOrderMoney(float orderMoney) {
		this.orderMoney = orderMoney;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

}
