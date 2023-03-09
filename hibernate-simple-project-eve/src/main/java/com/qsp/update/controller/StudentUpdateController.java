package com.qsp.update.controller;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.bean.Student;

public class StudentUpdateController {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Student student=entityManager.find(Student.class, 101);
	
	System.out.println(student.getId() + "" + student.getEmail());
	
	if(student!=null) {
		
		student.setName("ManMohan");
		student.setEmail("amar@muthal");
		
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		
		System.out.println("New Name" +student.getName()+ "New Email" +student.getEmail()+ "is updated successfully");
	}
}
}
