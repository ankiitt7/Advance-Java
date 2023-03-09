package com.qsp.jdbc_prepared_statement_evo.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MobileConnection {
	public static Connection getConnection() {
		
		
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish the connection
			String url="jdbc:mysql://localhost:3306/jdbc-preparedstatement-eve";
			String user= "root";
			String pass="Ankit@77";
			
			Connection connection = DriverManager.getConnection(url,user,pass);
			
			if(connection!=null) {
				return connection;
			}
			else
			{
				System.out.println("check your connection");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
