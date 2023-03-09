package com.qsp.hibernate_many_to_many_bi_eve.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.qsp.hibernate_many_to_many_bi_eve.dto.Customer;
import com.qsp.hibernate_many_to_many_bi_eve.dto.Product;

public class CustomerProductDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insertCustomerProduct(List<Customer>customer,List<Product>product)
	{
		entityTransaction.begin();
		for(Customer customers:customer)
		{
			entityManager.persist(customers);
		}
		
		for(Product products:product)
		{
			entityManager.persist(products);
		}
		entityTransaction.commit();
	}
	
	public void deleteCustomerProductJPQL(int id)
	{
		String delete="Delete c From Customer c Where c.customerId=?123";
		Query query=entityManager.createQuery(delete);
		query.setParameter(123, id);
		query.executeUpdate();
		System.out.println("Data deleted succesfully......");
	}
}
