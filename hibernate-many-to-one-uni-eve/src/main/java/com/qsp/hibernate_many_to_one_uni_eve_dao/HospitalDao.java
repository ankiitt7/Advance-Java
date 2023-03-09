package com.qsp.hibernate_many_to_one_uni_eve_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.qsp.hibernate_many_to_one_uni_eve_dto.Hospital;

public class HospitalDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insertHospital(Hospital hospital)
	{
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
	}
	public void updateHospital(int hospitalId, Hospital hospital)
	{
		Hospital hospital2=entityManager.find(Hospital.class, hospitalId);
		if(hospital2!=null)
		{
			entityTransaction.begin();
			hospital2.setName(hospital.getName());
			hospital2.setAddress(hospital.getAddress());
			entityTransaction.commit();
		}
		else
		{
			System.out.println("Check hospital id once again");
		}
		System.out.println("Data updated");
	}
	public void deleteHospital(int hospitalId)
	{
		Hospital hospital=entityManager.find(Hospital.class, hospitalId);
		if(hospital!=null)
		{
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
		}
		System.out.println("data deleted");
	}
	public List<Hospital> displayHospital()
	{
		String select="select h from Hospital h";
		Query query=entityManager.createQuery(select);
		return query.getResultList();
	}
}
