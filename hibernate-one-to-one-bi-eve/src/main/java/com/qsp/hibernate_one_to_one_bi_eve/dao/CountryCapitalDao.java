package com.qsp.hibernate_one_to_one_bi_eve.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.hibernate_one_to_one_bi_eve.dto.Capital;
import com.qsp.hibernate_one_to_one_bi_eve.dto.Country;

public class CountryCapitalDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insertCountryCapital(Country country, Capital capital)
	{
		entityTransaction.begin();
		entityManager.persist(country);
//		entityManager.persist(capital);
		entityTransaction.commit();
		
		System.out.println("Data inserted.........");
	}
	
	public List<Capital> displayCountryCapital()
	{
		String select ="Select c From Capital c";
		return entityManager.createQuery(select,Capital.class).getResultList();
	}
	
	public void updateCountryCapital(int capitalId,String countryName)
	{
		Capital capital=entityManager.find(Capital.class, capitalId);
		
		if(capital!=null)
		{
			entityTransaction.begin();
			capital.getCountry().setCountryName(countryName);
			entityManager.merge(capital);
			entityTransaction.commit();
			System.out.println("data updated.........");
		}
	}
	
	public void deleteCountryCapital(int capitalId)
	{
		Capital capital=entityManager.find(Capital.class, capitalId);
		
		if(capital!=null)
		{
			entityTransaction.begin();
			entityManager.remove(capital.getCountry());
			entityManager.remove(capital);
			entityTransaction.commit();
			
			System.out.println("Data is deleted......");
		}
		else
		{
			System.out.println("Invalid id");
		}
}
	
}

