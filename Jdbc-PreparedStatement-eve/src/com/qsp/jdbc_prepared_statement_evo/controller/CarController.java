package com.qsp.jdbc_prepared_statement_evo.controller;

import java.util.Scanner;

import com.qsp.jdbc_prepared_statement_evo.dto.Car;
import com.qsp.jdbc_prepared_statement_evo.service.CarService;

public class CarController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CarService carService = new CarService();
		Car car = new Car();
		while(true) {
			System.out.println("1.Insert\n2.Update\n3.Delete");
			System.out.println("give your own option");
			int ch= scanner.nextInt();
			
			switch(ch) {
			
			case 1: {
				System.out.println("insert the car id");
				car.setCarId(scanner.nextInt());
				System.out.println("insert the name");
				car.setCarName(scanner.next());
				System.out.println("insert the model");
				car.setCarModel(scanner.next());
				System.out.println("insert the car price");
				car.setCarPrice(scanner.nextDouble());
				
				
				carService.insertCar(car);
			}
			break;
			
			case 2: {
				System.out.println("insert the car id");
				int id=scanner.nextInt();
				System.out.println("insert the car name");
				String name=scanner.next();
				System.out.println("insert the car model");
				String model=scanner.next();
				System.out.println("insert the car price");
				Double price=scanner.nextDouble();
				
				carService.updateCar(id,name,model,price);
				
			}
			break;
			
			case 3: {
				System.out.println("enter the id to delete record");
				int id=scanner.nextInt();
				
				carService.deleteCar(id);
			}
			break;
			}
			
		}
	}
}
