package com.fruit.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "FruitBean") // 可以实现对象和XML数据之间的转换
public class FruitPageBean {
	private int currentPage;
	private int pageSize;
	private int count;
	private int totalPage;
	private List<Fruit> fruits;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<Fruit> getFruits() {
		return fruits;
	}

	public void setFruits(List<Fruit> fruits) {
		this.fruits = fruits;
	}

}
