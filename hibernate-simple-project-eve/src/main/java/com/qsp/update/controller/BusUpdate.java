package com.qsp.update.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.bean.Bus;

public class BusUpdate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Bus bus=entityManager.find(Bus.class, 3);
		System.out.println(bus.getId()+" "+bus.getName()+" "+bus.getSpeed());
		
		if(bus!=null)
		{
			bus.setId(3);
			bus.setName("Punjab Roadways");
			bus.setSpeed("120kmph");
			
			entityTransaction.begin();
			entityManager.merge(bus);
			entityTransaction.commit();
			
			System.out.println("Data updated.......");
		}
		
	}
}
