package com.qsp.hibernate_many_to_many_uni_eve.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.hibernate_many_to_many_uni_eve.dto.players;


public class playersDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	
	
	
	
	
	
	public void insertPlayers(List <players>Players)
	{
		for(players player:Players)
		{
			entityTransaction.begin();
			entityManager.persist(player);
			entityTransaction.commit();
		}
	}
}
