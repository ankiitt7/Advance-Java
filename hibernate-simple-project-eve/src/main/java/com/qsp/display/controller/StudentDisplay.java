package com.qsp.display.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.qsp.bean.Student;

public class StudentDisplay {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("ankit");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	
	String select=  "Select s From Student s";
	
	Query query = entityManager.createQuery(select);
	
	List <Student> students=query.getResultList();
	
	for(Student student : students)
	{
		System.out.println("StudentId: "+student.getId());
		System.out.println("StudentEmail: "+student.getEmail());
		System.out.println("StudentName: "+student.getName());
		
		System.out.println("------------------------------------------------");
	}
}
}
