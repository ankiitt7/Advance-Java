package com.qsp.servlet_project2_dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.qsp.servlet_project2_dto.Employee;

public class EmployeeDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insertEmployee(Employee employee)
	{
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		
		System.out.println("Data inserted......");
	}
	

}
