package com.spring_core_crud_operation_with_annotation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring_core_crud_operation_with_annotation.dto.Team;
@Component
public class TeamDao {
	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	
	
	public void insertTeam(Team team)
	{
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(team);
		entityTransaction.commit();
	}
}
