package com.fruit.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.fruit.dao.FruitDaoInterface;
import com.fruit.dao.impl.FruitDaoInterfaceImpl;
import com.fruit.pojo.Fruit;
import com.fruit.pojo.FruitPageBean;
import com.fruit.service.FruitServiceInterface;

/**
 * @author Zain(zy)
 */
public class FruitServiceInterfaceImpl implements FruitServiceInterface {
	private FruitDaoInterface fruitDaoInterface = new FruitDaoInterfaceImpl();

	@Override
	public FruitPageBean findFruitPage(int currentPage, int pageSize) throws Exception {

		// 封装
		FruitPageBean fpb = null;

		try {
			int count = fruitDaoInterface.count();// 得到总记录数
			int totalPage = (int) Math.ceil(count * 1.0 / pageSize);// 总页数
			List<Fruit> fruits = fruitDaoInterface.findFruits(currentPage, pageSize);

			fpb = new FruitPageBean();

			fpb.setCount(count);
			fpb.setCurrentPage(currentPage);
			fpb.setPageSize(pageSize);
			fpb.setTotalPage(totalPage);
			fpb.setFruits(fruits);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return fpb;

	}

	@Override
	public Fruit findFruitByID(String fruitID) throws Exception {
		Fruit fruit = fruitDaoInterface.findFruitByID(fruitID);
		return fruit;
	}

}
