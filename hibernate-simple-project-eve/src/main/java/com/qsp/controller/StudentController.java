package com.qsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.bean.Student;

public class StudentController {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Student student=new Student();
	student.setId(102);
	student.setName("Ankit");
	student.setEmail("sainiankit1608@gmail.com");
	
	entityTransaction.begin();
	entityManager.persist(student);
	
	entityTransaction.commit();
	System.out.println("Data is inserted............");
	
}
}

