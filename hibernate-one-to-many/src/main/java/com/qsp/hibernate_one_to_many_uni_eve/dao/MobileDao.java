package com.qsp.hibernate_one_to_many_uni_eve.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.hibernate_one_to_many_uni_eve.dto.Mobile;
import com.qsp.hibernate_one_to_many_uni_eve.dto.Sim;

public class MobileDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insertMobile(Mobile mobile)
	{
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityTransaction.commit();
	}
	public void insertMobile1(Mobile mobile,List<Sim> sims)
	{
		entityTransaction.begin();
		entityManager.persist(mobile);
		for (Sim sim : sims) 
		{
			entityManager.persist(sim);
		}
		entityTransaction.commit();
		System.out.println("Data Inserted");
	}
	
	
	public void updateMobile(Mobile mobile,List<Sim> sims,int id)
	{
		Mobile mobile2=entityManager.find(Mobile.class, id);
		List<Sim> sims1=mobile2.getSims();
		entityTransaction.begin();
		if(mobile2!=null)
		{
			mobile2.setMobileBrandName(mobile.getMobileBrandName());
			mobile2.setMobilePrice(mobile.getMobilePrice());
			mobile2.setMobileColor(mobile.getMobileColor());
			entityManager.merge(mobile2);
			for (Sim sim : sims1) 
			{
				for (Sim sim2 : sims) {		
					sim.setCompanyName(sim2.getCompanyName());
					sim.setSimsize(sim2.getSimSize());
					sim.setSimNetworkType(sim2.getSimNetworkType());
					entityManager.merge(sim);
				}
			}
			entityTransaction.commit();
		}
	}
	public void deleteMobile(int id)
	{
		Mobile mobile2=entityManager.find(Mobile.class, id);
		List<Sim> sims1=mobile2.getSims();
		entityTransaction.begin();
		entityManager.remove(mobile2);
		for (Sim sim : sims1) 
		{
			entityManager.remove(sim);	
		}
		entityTransaction.commit();
		System.out.println("Data Deleted");
	}
	}
	
	