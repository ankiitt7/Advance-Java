package com.qsp;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
public static void main(String[] args) {
	
		Connection conn=null;
	try {
		//step 1: LOAD THE DRIVER
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 2: establish the connection
		String url="jdbc:mysql://localhost:3306/jdbc-simple-project";
		String user="root";
		String pass="Ankit@77";
		conn = DriverManager.getConnection(url,user,pass);
		//step 3: create the statement
		
		Statement statement = conn.createStatement();
		
		//step 4: EXECUTE QUERY
		String insert= "insert into employee value(1001,'rishu','rishu@gmail.com')";
		statement.execute(insert);
		
		System.out.println("Inserted....");
		System.out.println(conn);
	}
	catch (ClassNotFoundException | SQLException e)
	{
		e.printStackTrace();
	}
	
	    //step 5: Close the connection
	
	finally {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
}
