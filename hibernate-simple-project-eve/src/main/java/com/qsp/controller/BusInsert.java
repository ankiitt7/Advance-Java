package com.qsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.bean.Bus;

public class BusInsert {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ankit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Bus bus = new Bus();
		bus.setId(4);
		bus.setName("Himachal Roadways");
		bus.setSpeed("80kmph");
		
		entityTransaction.begin();
		entityManager.persist(bus);
		
		entityTransaction.commit();
		System.out.println("Data Inserted.........");
		
	}
}
