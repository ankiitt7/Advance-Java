package com.ibm.jdbc_crud_operations_statements.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.xdevapi.Result;
import com.ibm.jdbc_crud_operations_statements.dto.Teacher;

public class TeacherDao {
	
	
	//insertMethod
public void insertTeacher(Teacher teacher) {
	
	try {
		//step 1:load the driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		//this is full classified name of driver class which is present in mysql jar file
		
		//step 2: connect to database 
		String url= "jdbc:mysql://localhost:3306/jdbc-crud-operations-statements";
		//this is the address of mysql database or schema and it is provided by mysql it self so we can't change it
		
		String user= "root";
		//this is also given by mysql
		
		String pass= "Ankit@77";
		//this is given by us
		
		Connection connection = DriverManager.getConnection(url,user,pass);
		//this DriverManager class is helping class and throw sql exception and return connection interface thats why we store in connection type reference
		//Connection is interface in java.sql package
		
		//step 3: create the statement
		Statement statement= connection.createStatement();
		//createStatement method is connection whose return type is statement type,statement is also interface;
		
		String insert = "insert into teacher values("+teacher.getTeacherId()+",'"+teacher.getTeacherName()+"','"+teacher.getTeacherSubject()+"')";
		statement.execute(insert);
		System.out.println("data inserted.....");
		
	} catch (ClassNotFoundException | SQLException e){
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

//method getById
public int getById(int id)
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url= "jdbc:mysql://localhost:3306/jdbc-crud-operations-statements";
		String user = "root";
		String pass= "root";
		
		Connection connection= DriverManager.getConnection(url,user,pass);
		Statement statement= connection.createStatement();
		
		String insert="Select * from teacher where id ="+id+"";
		ResultSet resultSet=statement.executeQuery(insert);
		resultSet.next();
		try {
			int id1=resultSet.getInt("id");
			return id1;
	
		} catch (Exception e) {
			System.out.println("resultSet is empty");
			// TODO: handle exception
		}
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	return 0;
}

//update
public List<Teacher> updateTeacher(String name,int id)
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url= "jdbc:mysql://localhost:3306/jdbc-crud-operations-statements";
		String user = "root";
		String pass= "root";
		

		Connection connection= DriverManager.getConnection(url,user,pass);
		Statement statement= connection.createStatement();
		String update = "update teacher set name'"+ name +"' Where id=" +id + "";
		statement.execute(update);
		System.out.println("data updated");
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}
	
	public  List<Teacher> displayTeacher() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url= "jdbc:mysql://localhost:3306/jdbc-crud-operations-statements";
			String user = "root";
			String pass= "Ankit@77";
			

			Connection connection= DriverManager.getConnection(url,user,pass);
			Statement statement= connection.createStatement();
			String update= "SELECT * FROM teacher";
			
			ResultSet resultSet = statement.executeQuery(update);
			List<Teacher> teachers = new ArrayList<Teacher>();
			while(resultSet.next())
			{
				Teacher teacher = new Teacher();
				
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String subject =resultSet.getString("email");
				
				teacher.setTeacherId(id);
				teacher.setTeacherName(name);
				teacher.setTeacherSubject(subject);
				
				teachers.add(teacher);
				
			}
			
			return teachers;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
	}
	
}

