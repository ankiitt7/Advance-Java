package com.qsp.jdbc_prepared_statement_evo.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qsp.jdbc_prepared_statement_evo.connection.CollegeConnection;


public class CollegeDao {

	Connection connection=null;
	
	public void insertCollege(College college)
	{
		connection=CollegeConnection.getConnection();
	
	String insert= "insert into college values(?,?,?,?)";
	
	try {
		PreparedStatement preparedStatement = connection.prepareStatement(insert);
		
		preparedStatement.setInt(1,college.getId());
		preparedStatement.setString(2,college.getName());
		preparedStatement.setString(3,college.getCity());
		preparedStatement.setDouble(4,college.getPincode());
		
		preparedStatement.execute();
		
		System.out.println("Data inserted........");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void updateCollege(int id, String name, String city, Double pincode)
	{
		connection=CollegeConnection.getConnection();
		
		String update= "update college set name=?, city=?, pincode=? where id=?";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(update);
			preparedStatement.setInt(4,id);
			preparedStatement.setString(1,name);
			preparedStatement.setString(2,city);
			preparedStatement.setDouble(3,pincode);
			
			preparedStatement.executeUpdate();
			
			System.out.println("data updated........");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteCollege(int id)
	{
		connection=CollegeConnection.getConnection();
		String delete="delete from college where id=?";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(delete);
			preparedStatement.setInt(1,id);
			
			preparedStatement.executeUpdate();
			
			System.out.println("data deleted..........");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<College> displayCollege() {
		connection=CollegeConnection.getConnection();
		String select= "select * from college";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(select);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			List <College> list=new ArrayList<College>();
			while(resultSet.next()) {
				College college=new College();
				college.setId(resultSet.getInt("id"));
				college.setName(resultSet.getString("name"));
				college.setCity(resultSet.getString("city"));
				college.setPincode(resultSet.getDouble("pincode"));
				
				list.add(college);
				
			}
			return list;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
	public void insertAddBatch(List<College> college)
	{
		connection=CollegeConnection.getConnection();
		String insert= "insert into college values(?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(insert);
			
			for(College college2: college)
			{
				preparedStatement.setInt(1,college2.getId());
				preparedStatement.setString(2, college2.getName());
				preparedStatement.setString(3,college2.getCity());
				preparedStatement.setDouble(4, college2.getPincode());
				
				
				preparedStatement.addBatch();
			}
			
				preparedStatement.executeBatch();
		
				System.out.println("data stored...........");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
