package com.qsp.hibernate_simple_crud_operations.service;

import java.util.List;

import com.qsp.hibernate_simple_crud_operations.dao.TrainDao;
import com.qsp.hibernate_simple_crud_operations.dto.Train;


public class TrainService {

	TrainDao dao=new TrainDao();
	
	public void trainInsert(Train train)
	{
		dao.trainInsert(train);
	}
	
	public void trainUpadte(int id, Train train)
	{
		dao.trainUpadte(id, train);
	}
	
	public void deleteTrain(int TrainId, Train train)
	{
		dao.deleteTrain(TrainId);
	}
	
	public List<Train> displayTrain()
	{
		return dao.displayTrain();
	}
}
