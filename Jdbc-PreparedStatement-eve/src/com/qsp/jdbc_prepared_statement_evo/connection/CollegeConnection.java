package com.qsp.jdbc_prepared_statement_evo.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CollegeConnection {

	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/jdbc-preparedstatement-eve";
			String user="root";
			String pass="Ankit@77";
			
			Connection connection= DriverManager.getConnection(url,user,pass);
			
			if(connection!=null)
			{
				return connection;
			}
			else
			{
				System.out.println("Check your Connection");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
