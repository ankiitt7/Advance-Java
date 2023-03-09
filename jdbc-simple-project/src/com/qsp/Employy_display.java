package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employy_display {
public static void main(String[] args) {
	try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 String url=("jdbc:mysql://localhost:3306/jdbc-simple-project");
		 String user=("root");
		 String password=("Ankit@77");
		 Connection connection= DriverManager.getConnection(url,user,password);
		 Statement statement = connection.createStatement();
		 String select= "SELECT * FROM EMPLOYEE";
		 ResultSet resultSet = statement.executeQuery(select);
		 while(resultSet.next()) {
			 System.out.println("id="+resultSet.getInt(1));
			 System.out.println("name="+resultSet.getString(2));
			 System.out.println("email="+resultSet.getString(3));
		 }
	} catch (Exception e) {
		
	}
}
}
