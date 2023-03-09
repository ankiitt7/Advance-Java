package com.qsp.hibernate_one_to_many_uni_eve.dao;




import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.hibernate_one_to_many_uni_eve.dto.Sim;

public class SimDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insertSim(List<Sim> sims)
	{
		for(Sim sim: sims)
		{
			entityTransaction.begin();
			entityManager.persist(sim);
			entityTransaction.commit();
		}
		System.out.println("Data inserted....");		
	}
	
//	//getById method
//	public Sim getById(int id)
//	{
//		Sim sim=entityManager.find(Sim.class, id);
//		if(sim!=null)
//		{
//			return sim;
//		}
//		else
//		{
//			System.out.println("Id is not present in table");
//		}
//		return null;
//	}
	
	public List<Sim> getAllSims()
	{
		String select = "Select s From Sim s";
		return entityManager.createQuery(select,Sim.class).getResultList();
	}
}
