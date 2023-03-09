package com.qsp.jdbc_prepared_statement_evo.service;

import com.qsp.jdbc_prepared_statement_evo.dao.CarDao;
import com.qsp.jdbc_prepared_statement_evo.dto.Car;

public class CarService {
	CarDao dao = new CarDao();
	
	
	//insert method
	public void insertCar(Car car)
	{
		dao.insertCar(car);
	}
	
	public void updateCar(int id,String name,String model,Double price)
	{
		dao.updateCar(id, name, model, price);
	}
	public void deleteCar(int id)
	{
		dao.deleteCar(id);
	}
}
