package com.fruit.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.fruit.dao.FruitDaoInterface;
import com.fruit.pojo.Fruit;
import com.fruit.util.C3P0Util;
import com.fruit.util.ManagerThreadLocal;

public class FruitDaoInterfaceImpl implements FruitDaoInterface {

	@Override
	public int count() throws Exception {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		String sql = "select count(*) from fruits where fruitReserve>0";
		long l = (Long) qr.query(sql, new ScalarHandler(1));
		// .out.println("≤‚ ‘£∫count="+l);

		return (int) l;
	}

	@Override
	public List<Fruit> findFruits(int currentPage, int pageSize) throws Exception {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		String sql = "select * from fruits where fruitReserve>0 limit ?,? ";
		// .out.println("≤‚ ‘£∫ø™ º÷¥––sql");
		return qr.query(sql, new BeanListHandler<Fruit>(Fruit.class), (currentPage - 1) * pageSize, pageSize);
	}

	@Override
	public Fruit findFruitByID(String fruitID) throws Exception {

		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());

		return qr.query("SELECT * FROM fruits WHERE fruitID=? ", new BeanHandler<Fruit>(Fruit.class), fruitID);
	}

	@Override
	public void updateReserve(Object[][] params) throws Exception {
		QueryRunner qr = new QueryRunner();
		qr.batch(ManagerThreadLocal.getConnection(), "UPDATE fruits SET fruitReserve=fruitReserve-? WHERE fruitID=?;",
				params);

	}

}
