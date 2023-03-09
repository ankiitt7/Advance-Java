package com.qsp.delete.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.bean.Student;

public class StudentDelete {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("ankit");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	Student student=entityManager.find(Student.class, 101);
	
	if(student!=null)
	{
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
		
		System.out.println("Data Deleted......");
	}
	else
	{
		System.out.println("Idiots please check the passed id");
	}
}
}
