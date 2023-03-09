package com.ibm.jdbc_crud_operations_statements.dao;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.ibm.jdbc_crud_operations_statements.dto.Laptop;

public class LaptopDao {
	Connection connection = null;

	public void insertLaptop(Laptop laptop) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc-crud-operations-statements";
			String user = "root";
			String password = "Ankit@77";
			connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			String insert = "insert into laptop values(" + laptop.getId() + ",'" + laptop.getName() + "',"
					+ laptop.getPrice() + ",'" + laptop.getColor() + "')";
			statement.execute(insert);

			System.out.println("data inserted....");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void updateLaptopName(Laptop laptop) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc-crud-operations-statements";
			String user = "root";
			String password = "Ankit@77";
			connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			
			String update="update laptop set name ='"+ laptop.getName() + "' where id=" + laptop.getId() +"";
			statement.executeUpdate(update);
			System.out.println("Data updated......");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateLaptopPrice(Laptop laptop) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc-crud-operations-statements";
			String user = "root";
			String password = "Ankit@77";
			connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			
			String update="update laptop set price= '"+ laptop.getPrice() + "' where id=" + laptop.getId() +"";
			statement.executeUpdate(update);
			System.out.println("Data updated......");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateLaptopColor(Laptop laptop) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc-crud-operations-statements";
			String user = "root";
			String password = "Ankit@77";
			connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			
			String update="update laptop set color= '"+ laptop.getColor() + "' where id=" + laptop.getId() +"";
			statement.executeUpdate(update);
			System.out.println("Data updated......");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void deleteLaptop(Laptop laptop) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc-crud-operations-statements";
			String user = "root";
			String password = "Ankit@77";
			connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			
			String delete="delete from laptop where id=" + laptop.getId() +"";
			statement.executeUpdate(delete);
			System.out.println("Data deleted......");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<Laptop> displayLaptop() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc-crud-operations-statements";
			String user = "root";
			String password = "Ankit@77";
			connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			
			String display="select * from laptop";
			ResultSet resultset=statement.executeQuery(display);
			List<Laptop> laptops=new ArrayList<Laptop>();
			
			while(resultset.next()) {
				Laptop laptop=new Laptop();
				laptop.setId(resultset.getInt("id"));
				laptop.setName(resultset.getString("name"));
				laptop.setPrice(resultset.getInt("price"));
				laptop.setColor(resultset.getString("color"));
				
				laptops.add(laptop);
			}
			return laptops;

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
