package com.qsp.hibernate_one_to_one_uni_eve.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.qsp.hibernate_one_to_one_uni_eve.dto.Employee;
import com.qsp.hibernate_one_to_one_uni_eve.dto.Laptop;

public class EmployeeDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insertEmployee(Employee employee,Laptop laptop) {
		entityTransaction.begin();
		entityManager.persist(laptop);
		entityManager.persist(employee);
		entityTransaction.commit();
		
		System.out.println("Data inserted....");
		
	
	}
	
	public void updateLaptopEmployee(Employee employee, Laptop laptop, int id1)
	{
		Employee employee2 = entityManager.find(Employee.class, id1);
		
		Laptop laptop2=employee2.getLaptop();
		
		if(employee2!=null)
		{
			
			laptop2.setName(laptop.getName());
			laptop2.setPrice(laptop.getPrice());
			employee2.setName(employee.getName());
			employee2.setEmail(employee.getEmail());
			
			entityTransaction.begin();
			entityManager.merge(laptop2);
			entityManager.merge(employee2);
			entityTransaction.commit();
			
			System.out.println("Data Updated......");
			
		}
		else
		{
			System.out.println("Check your employee ID");
		}
	}
	
	public void deleteLaptopEmployee(int id)
	{
		Employee employee2 = entityManager.find(Employee.class, id);
		
		Laptop laptop2=employee2.getLaptop();
		
		if(employee2!=null)
		{
		
		entityTransaction.begin();
		if(laptop2!=null)
		{
			entityManager.remove(laptop2);
		}
		else
		{
			System.out.println("Not Found");
		}
		entityManager.remove(employee2);
		entityTransaction.commit();
		}
		
		else
		{
			System.out.println("laptop Id not found");
		}
		
	}
	
	public List<Employee> displayEmployeeLaptop()
	{
		String select="select e from Employee e";
		Query query =entityManager.createQuery(select);
		return query.getResultList();
	}
}
