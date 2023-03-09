package com.qsp.display.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.qsp.bean.Bus;

public class BusDisplay {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("ankit");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	
	String select=  "Select b From Bus b";
	
	Query query = entityManager.createQuery(select);
	
	List <Bus> buss=query.getResultList();
	
	for(Bus bus : buss)
	{
		System.out.println("Bus Id:"+bus.getId());
		System.out.println("Bus Name:"+bus.getName());
		System.out.println("Bus Speed:"+bus.getSpeed());
		
		System.out.println("==========================================");
	}
}
}
