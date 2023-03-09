package com.qsp.jdbc_prepared_statement_evo.service;

import java.util.List;

import com.qsp.jdbc_prepared_statement_evo.dao.MobileDao;
import com.qsp.jdbc_prepared_statement_evo.dto.Mobile;

public class MobileService {
	MobileDao dao=new MobileDao();
	
	//insertMethod
	public void insertMobile(Mobile mobile)
	{
		dao.insertMobile(mobile);
	}
	public void updateMobile(int id, String color,double price,String camera)
	{
		int id1=dao.getById(id);
		if(id1==id)
		{
			dao.updateMobile(id, color, price, camera);
		}
		else
		{
			System.out.println("id is not matched");
		}
	}
	public void deleteMobile(int id)
	{
		int id1=dao.getById(id);
		if(id1==id)
		{
			dao.deleteMobile(id);
		}
		else
		{
			System.out.println("id is not matched");
		}
	}
	public List<Mobile> displayMobile()
	{
		return dao.displayMobile();
		
	}
	public void insertAddBatch(List<Mobile> mobile)
	{
		dao.insertAddBatch(mobile);
	}
	
}
