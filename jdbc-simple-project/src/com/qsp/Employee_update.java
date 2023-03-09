package com.qsp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee_update {
public static void main(String[] args) {
	Connection conn=null;
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url=("jdbc:mysql://localhost:3306/jdbc-simple-project");
		String user="root";
		String password="Ankit@77";
		conn=DriverManager.getConnection(url,user,password);
		Statement statement=conn.createStatement();
		String update="update employee set name='shyam' where id =1000";
		int id=statement.executeUpdate(update);
		if(id!=0)
		{
			System.out.println("data update");
		}
		else
		{
			System.out.println("id is not present");
		}
	}
	catch(ClassNotFoundException | SQLException e )
	{
		e.printStackTrace();
	}
}
}
