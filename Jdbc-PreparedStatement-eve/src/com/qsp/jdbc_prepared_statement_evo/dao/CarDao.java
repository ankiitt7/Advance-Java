package com.qsp.jdbc_prepared_statement_evo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.qsp.jdbc_prepared_statement_evo.connection.CarConnection;
import com.qsp.jdbc_prepared_statement_evo.dto.Car;



public class CarDao {
Connection connection = null;
	
	public void insertCar(Car car) {
		connection=CarConnection.getConnection();
		
		String insert= "insert into car values(?,?,?,?)";
		
		try {
PreparedStatement preparedStatement = connection.prepareStatement(insert);
			
			preparedStatement.setInt(1,car.getCarId());
			preparedStatement.setString(2,car.getCarName());
			preparedStatement.setString(3,car.getCarModel());
			preparedStatement.setDouble(4,car.getCarPrice());
			
			preparedStatement.execute();
			
			System.out.println("data inserted.............");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void updateCar(int id,String name,String model,Double price)
	{
		connection=CarConnection.getConnection();
		String update= "update car set name=?, model=?, price=? Where id=?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(update);
			
			preparedStatement.setInt(4, id);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, model);
			preparedStatement.setDouble(3, price);
			
			preparedStatement.executeUpdate();
			
			System.out.println("data updated......");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void deleteCar(int id)
	{
		connection=CarConnection.getConnection();
		String delete= "delete from car Where id=?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(delete);
			preparedStatement.setInt(1,id);
			
			preparedStatement.executeUpdate();
			
			System.out.println("data deleted.........");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
