package com.fruit.dao;

import java.util.List;

import com.fruit.pojo.Fruit;

public interface FruitDaoInterface {
	public int count() throws Exception;

	public List<Fruit> findFruits(int currentPage, int pageSize) throws Exception;
	
	public Fruit findFruitByID(String fruitID)throws Exception;
	
	public void updateReserve(Object[][] params)throws Exception;
}
