package com.qsp.hibernate_simple_crud_operations.dao;

import java.io.FileNotFoundException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.qsp.hibernate_simple_crud_operations.dto.Train;

public class TrainDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void trainInsert(Train train)
	{
		train.setTrainId(train.getTrainId());
		train.setTrainName(train.getTrainName());
		train.setTrainCoaches(train.getTrainCoaches());
		
		entityTransaction.begin();
		entityManager.persist(train);
		entityTransaction.commit();
		
		System.out.println("Data inserted....");
	}
	
	public void trainUpadte(int id, Train train)
	{
		Train train2=entityManager.find(Train.class, id);
		if((train.getTrainName()!=null)&&train.getTrainCoaches()!=0)
		{
			train2.setTrainName(train.getTrainName());
			train2.setTrainCoaches(train.getTrainCoaches());
			
			entityTransaction.begin();
			entityManager.merge(train2);
			entityTransaction.commit();
		}
		else if(train.getTrainCoaches()!=0)
		{
			train2.setTrainCoaches(train.getTrainCoaches());
			
			entityTransaction.begin();
			entityManager.merge(train2);
			entityTransaction.commit();
		}
		else if(train.getTrainName()!=null)
		{
			train2.setTrainName(train.getTrainName());
			
			entityTransaction.begin();
			entityManager.merge(train2);
			entityTransaction.commit();
		}
		else
		{
			System.out.println("Train is not found");
		}
	}
	
	public void deleteTrain(int TrainId)
	{
		Train train=entityManager.find(Train.class,TrainId);
		
		if(train!=null)
		{
			entityTransaction.begin();
			entityManager.remove(train);
			entityTransaction.commit();
			System.out.println("Deleted....");
		}
		else
		{
			try 
			{
				throw new FileNotFoundException("Idiots checkn your Id first");
			}
			catch(FileNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		
		}
	}
	
	public List<Train> displayTrain()
	{
		String select="Select t FROM Train t";
		Query query=entityManager.createQuery(select);
		return query.getResultList();
	}
}
