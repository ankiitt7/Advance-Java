package com.qsp.hibernate_one_to_many_bi_eve.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.qsp.hibernate_one_to_many_bi_eve.dto.College;
import com.qsp.hibernate_one_to_many_bi_eve.dto.Student;

public class CollegeStudentDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insertCollegeStudent(College college, List<Student>students)
	{
		entityTransaction.begin();
		entityManager.persist(college);
		for(Student student:students)
		{
			entityManager.persist(student);
		}
		entityTransaction.commit();
	}
	
	public void updateCollegeStudent(int collegeId,String StudentName)
	{
		College college=entityManager.find(College.class, collegeId);
		List<Student>student1=college.getStudents();
		entityTransaction.begin();
		for(Student student : student1)
		{
			student.setStudentName(StudentName);
			entityManager.merge(student);
		}
		entityTransaction.commit();
		
	}
	
	public void deleteCollegeStudent(int collegeId)
	{
		College college=entityManager.find(College.class, collegeId);
		List<Student>student1=college.getStudents();
		entityTransaction.begin();
		for(Student student : student1)
		{
			
			entityManager.remove(student);
		}
		entityTransaction.commit();
	}
	
	public List<College> displayCollegeStudent()
	{
		String select="Select c from college c";
		Query query=entityManager.createNamedQuery(select);
		return query.getResultList();
	}
}
