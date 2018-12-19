package com.fruit.service;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

import com.fruit.pojo.Fruit;
import com.fruit.pojo.FruitPageBean;

@WebService
@BindingType(SOAPBinding.SOAP12HTTP_BINDING) // ʹ��SOAP1.2�汾
public interface FruitServiceInterface {
	public FruitPageBean findFruitPage(int currentPage, int pageSize) throws Exception;
	public Fruit findFruitByID(String fruitID) throws Exception;
}