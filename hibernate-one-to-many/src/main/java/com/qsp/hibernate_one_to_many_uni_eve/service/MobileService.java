package com.qsp.hibernate_one_to_many_uni_eve.service;

import java.util.List;

import com.qsp.hibernate_one_to_many_uni_eve.dao.MobileDao;
import com.qsp.hibernate_one_to_many_uni_eve.dao.SimDao;
import com.qsp.hibernate_one_to_many_uni_eve.dto.Mobile;
import com.qsp.hibernate_one_to_many_uni_eve.dto.Sim;


public class MobileService {
	MobileDao dao2=new MobileDao();
	public void insertMobile(Mobile mobile)
	{
		SimDao dao=new SimDao();
		List<Sim> sims= dao.getAllSims();
		
		mobile.setSims(sims);
		dao2.insertMobile(mobile); 
	}
	public void insertMobile1(Mobile mobile,List<Sim> sims)
	{
		dao2.insertMobile1(mobile, sims);
	}
	public void updateMobile(Mobile mobile,List<Sim> sims,int id)
	{
		dao2.updateMobile(mobile, sims, id);
	}
	public void deleteMobile(int id)
	{
		dao2.deleteMobile(id);
	}
	

}
