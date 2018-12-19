package com.order.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OrderItem") // ����ʵ�ֶ����XML����֮���ת��
public class OrderItem {

	private String orderItemID;
	private int orderItemQuantity;
	private String orderID;
	private String fruitID;

	public String getOrderItemID() {
		return orderItemID;
	}

	public void setOrderItemID(String orderItemID) {
		this.orderItemID = orderItemID;
	}

	public int getOrderItemQuantity() {
		return orderItemQuantity;
	}

	public void setOrderItemQuantity(int orderItemQuantity) {
		this.orderItemQuantity = orderItemQuantity;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getFruitID() {
		return fruitID;
	}

	public void setFruitID(String fruitID) {
		this.fruitID = fruitID;
	}

}
