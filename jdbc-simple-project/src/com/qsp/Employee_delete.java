package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Employee_delete {
public static void main(String[] args) {
 try {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 String url=("jdbc:mysql://localhost:3306/jdbc-simple-project");
	 String user=("root");
	 String password=("Ankit@77");
	 Connection connection= DriverManager.getConnection(url,user,password);
	 Statement statement=connection.createStatement();
	 String delete="delete from employee where id=1001";
	 int id= statement.executeUpdate(delete);
	 if(id!=0)
		{
			System.out.println("data delete");
		}
		else
		{
			System.out.println("id is not present");
		}
} catch (Exception e) {
	
}
}
}
