package com.fruit.service;


import java.util.ArrayList;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

import com.fruit.pojo.UpdateEntry;

@WebService
@BindingType(SOAPBinding.SOAP12HTTP_BINDING) // ʹ��SOAP1.2�汾
public interface FruitServiceInterface2 {
	
//	public void updateReserve(HashMap<String,Integer> params)throws Exception;
	public void updateReserve(ArrayList<UpdateEntry> params)throws Exception;
}
