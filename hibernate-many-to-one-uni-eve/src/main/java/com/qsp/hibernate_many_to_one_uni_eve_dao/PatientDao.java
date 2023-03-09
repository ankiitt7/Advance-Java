package com.qsp.hibernate_many_to_one_uni_eve_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.qsp.hibernate_many_to_one_uni_eve_dto.Hospital;
import com.qsp.hibernate_many_to_one_uni_eve_dto.Patient;

public class PatientDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insertHospitalPatient(List<Patient> patients,Hospital hospital)
	{
		if(hospital!=null)
		{
			entityTransaction.begin();
			for (Patient patient : patients) 
			{
				if(patient!=null)
				{
					entityManager.persist(patient);
				}
				else
				{
					System.out.println("your patient is not comig from controller");
				}
			}
			entityManager.persist(hospital);
		}
		else
		{
			System.out.println("Your hospital is not coming from controller");
		}
		entityTransaction.commit();
		System.out.println("Data Inserted");
	}
	@SuppressWarnings("unused")
	public void updatePatientHospital(int patientId, String patientGender,int hospitalId,String hospitalName)
	
	{
		Patient patient=entityManager.find(Patient.class, patientId);
		Hospital hospital=patient.getHospital();
		if(patient!=null)
		{
			entityTransaction.begin();
			patient.setGender(patientGender);
			entityManager.merge(patient);
			if(hospital!=null)
			{
				hospital.setName(hospitalName);
			}
			else
			{
				System.out.println("hospital id is not present");
			}
			entityManager.merge(hospital);
			entityTransaction.commit();
		}
		else
		{
			System.out.println("patient id is not present");
		}
		System.out.println("data updated");
	}
	@SuppressWarnings("unused")
	public void deletePatient(int patientId)
	{
		Patient patient=entityManager.find(Patient.class, patientId);
//		Hospital hospital=patient.getHospital();
		if(patient!=null) 
		{
		entityTransaction.begin();
//		if(hospital!=null)
//			{
//				entityManager.remove(hospital);
//			}
//		else
//			{
//				System.out.println("hospital id is not present");
//			}
		entityManager.remove(patient);
		entityTransaction.commit();
		}
		else
		{
			System.out.println("patient id is not present");
		}
	}
	public List<Patient> displayPatientHospital()
	{
		String select="select p from Patient p";
		Query query=entityManager.createQuery(select);
		List<Patient> list=query.getResultList();
		return list;
	}
}
