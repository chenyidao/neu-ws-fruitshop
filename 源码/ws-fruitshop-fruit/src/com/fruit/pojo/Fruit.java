package com.fruit.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Fruit") // 可以实现对象和XML数据之间的转换
public class Fruit {
	private String fruitID;
	private String fruitName;
	private float fruitPrice;
	private int fruitReserve;
	private float fruitPurchasePrice;
	private String fruitDescription;

	public String getFruitID() {
		return fruitID;
	}

	public void setFruitID(String fruitID) {
		this.fruitID = fruitID;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public float getFruitPrice() {
		return fruitPrice;
	}

	public void setFruitPrice(float fruitPrice) {
		this.fruitPrice = fruitPrice;
	}

	public int getFruitReserve() {
		return fruitReserve;
	}

	public void setFruitReserve(int fruitReserve) {
		this.fruitReserve = fruitReserve;
	}

	public String getFruitDescription() {
		return fruitDescription;
	}

	public void setFruitDescription(String fruitDescription) {
		this.fruitDescription = fruitDescription;
	}

	public float getFruitPurchasePrice() {
		return fruitPurchasePrice;
	}

	public void setFruitPurchasePrice(float fruitPurchasePrice) {
		this.fruitPurchasePrice = fruitPurchasePrice;
	}

}
