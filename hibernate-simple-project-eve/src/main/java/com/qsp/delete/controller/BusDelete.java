package com.qsp.delete.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.bean.Bus;

public class BusDelete {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("ankit");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	Bus bus=entityManager.find(Bus.class, 4);
	
	if(bus!=null)
	{
		entityTransaction.begin();
		entityManager.remove(bus);
		entityTransaction.commit();
		
		System.out.println("Data Deleted.......");
	}
	
	else
	{
		System.out.println("Please check your ID");
	}
}
}
