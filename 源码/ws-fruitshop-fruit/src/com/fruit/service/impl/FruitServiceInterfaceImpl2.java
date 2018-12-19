package com.fruit.service.impl;

import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import com.fruit.dao.FruitDaoInterface;
import com.fruit.dao.impl.FruitDaoInterfaceImpl;
import com.fruit.pojo.UpdateEntry;
import com.fruit.service.FruitServiceInterface2;

public class FruitServiceInterfaceImpl2 implements FruitServiceInterface2 {
	private FruitDaoInterface fruitDaoInterface = new FruitDaoInterfaceImpl();

	public void updateReserve(ArrayList<UpdateEntry> entries) throws Exception {

		Object[][] paramsArray = new Object[entries.size()][];

		int i = 0;
		for (UpdateEntry temp : entries) {
			paramsArray[i] = new Object[] { temp.getValue(), temp.getKey() };
			i++;
		}

		fruitDaoInterface.updateReserve(paramsArray);
	}

}
