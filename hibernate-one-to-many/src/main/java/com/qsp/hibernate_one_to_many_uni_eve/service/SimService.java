package com.qsp.hibernate_one_to_many_uni_eve.service;

import java.util.List;

import com.qsp.hibernate_one_to_many_uni_eve.dao.SimDao;
import com.qsp.hibernate_one_to_many_uni_eve.dto.Sim;

public class SimService {

	SimDao simDao=new SimDao();
	
	public void insertSim(List<Sim> sims)
	{
		for(Sim sim : sims)
		{
			if(sim.getSimNetworkType().equalsIgnoreCase("4G"))
			{
				simDao.insertSim(null);
			}
			else
			{
				System.out.println("Check your sim network");
			}
		}
	}
	
//	public Sim getById(int id)
//	{
//		return simDao.getById(id);
//	}
	
	public List<Sim> getAllSims()
	{
		return simDao.getAllSims();	
	}
}
