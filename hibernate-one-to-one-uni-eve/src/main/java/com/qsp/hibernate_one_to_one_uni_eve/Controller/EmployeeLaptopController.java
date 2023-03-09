package com.qsp.hibernate_one_to_one_uni_eve.Controller;

import java.util.List;
import java.util.Scanner;

import com.qsp.hibernate_one_to_one_uni_eve.dto.Employee;
import com.qsp.hibernate_one_to_one_uni_eve.dto.Laptop;
import com.qsp.hibernate_one_to_one_uni_eve.service.EmployeeService;

public class EmployeeLaptopController {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	EmployeeService employeeService=new EmployeeService();
	Laptop laptop=null;
	Employee employee=null;
	while(true)
	{
		System.out.println("1.Insert\n2.Update\n3.Delete\n4.Display");
		System.out.println("Enter your choice");
		
		switch(sc.nextInt())
		{
		case 1: {
			laptop=new Laptop();
			System.out.println("Enter the laptop name");
			laptop.setName(sc.next());
			
			System.out.println("Enter the laptop price");
			laptop.setPrice(sc.nextDouble());
			
			employee=new Employee();
			System.out.println("Enter the employee name");
			employee.setName(sc.next());
			
			System.out.println("Enter the employee email");
			employee.setEmail(sc.next());
			
			employee.setLaptop(laptop);
			employeeService.insertEmployee(employee, laptop);
		}
		break;
		case 2: {
			laptop=new Laptop();
			employee=new Employee();
			System.out.println("Enter the employee ID");
			int id1=sc.nextInt();
			
			System.out.println("Enter the employee name");
			employee.setName(sc.next());
			
			System.out.println("Enter the employee email");
			employee.setEmail(sc.next());
			
			System.out.println("Enter the laptop name");
			laptop.setName(sc.next());
			
			System.out.println("Enter the laptop price");
			laptop.setPrice(sc.nextDouble());
			
			employeeService.updateLaptopEmployee(employee, laptop, id1);
			
			
		}
		break;
		case 3:
		{  
			
			employee=new Employee();
			System.out.println("Enter the ID to delete");
			employeeService.deleteLaptopEmployee(sc.nextInt());
		}
		break;
		case 4: 
		{
			List <Employee> list=employeeService.displayEmployeeLaptop();
			for(Employee employee2:list)
			{
				System.out.println(employee2.getId());
				System.out.println(employee2.getName());
				System.out.println(employee2.getEmail());
				
				System.out.println("===============================");
			}
		}
		}
		
	}
}
}
