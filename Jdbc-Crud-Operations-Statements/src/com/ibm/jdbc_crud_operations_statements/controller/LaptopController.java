package com.ibm.jdbc_crud_operations_statements.controller;

import java.util.List;
import java.util.Scanner;

import com.ibm.jdbc_crud_operation_statements.service.LaptopService;
import com.ibm.jdbc_crud_operations_statements.dto.Laptop;

public abstract class LaptopController {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Laptop laptop=new Laptop();
	LaptopService laptopService=new LaptopService();
	while(true)
	{
		System.out.println("1.Insert\n2.Update\n3.Delete\n4.Display\n5.For exit");
		System.out.println("choose your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.println("Enter the laptopId");
			laptop.setId(sc.nextInt());
			System.out.println("Enter the laptopName");
			laptop.setName(sc.next());
			System.out.println("Enter the laptopPrice");
			laptop.setPrice(sc.nextInt());
			System.out.println("Enter the laptopcolor");
			laptop.setColor(sc.next());
			laptopService.insertLaptop(laptop);
		}
		break;
		case 2:
		{

		System.out.println("Enter 1 for name and 2 for price and 3 for color");
		int x=sc.nextInt();
		switch(x) {
		
		case 1:
		{
			System.out.println("Enter the laptopId");
			laptop.setId(sc.nextInt());
			System.out.println("Enter the laptopName");
			laptop.setName(sc.next());
			laptopService.updateLaptopName(laptop);
		}
		
		case 2:
		{
			System.out.println("Enter the laptopId");
			laptop.setId(sc.nextInt());
			System.out.println("Enter the laptopPrice");
			laptop.setPrice(sc.nextInt());
			laptopService.updateLaptopPrice(laptop);
		}
		
		case 3:
		{
			System.out.println("Enter the laptopId");
			laptop.setId(sc.nextInt());
			System.out.println("Enter the laptopColor");
			laptop.setColor(sc.next());
			laptopService.updateLaptopColor(laptop);
		}
		}
		}
		break;
		case 3:
		{
			System.out.println("Enter the laptopId");
			laptop.setId(sc.nextInt());
			laptopService.deleteLaptop(laptop);
		}
		break;
		case 4:
		{
			List<Laptop> laptops=laptopService.displayLaptop();
			for(Laptop laptop2:laptops) {
				System.out.println(laptop2);
				System.out.println(".....................................");
			}
		}
		break;
		case 5:
		{
			System.exit(0);
		}
		break;
		
		default:break;
		}
		
	}
}
}
