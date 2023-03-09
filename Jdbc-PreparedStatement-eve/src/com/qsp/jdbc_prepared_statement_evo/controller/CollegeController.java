package com.qsp.jdbc_prepared_statement_evo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.qsp.jdbc_prepared_statement_evo.dto.College;
import com.qsp.jdbc_prepared_statement_evo.service.CollegeService;

public class CollegeController {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		CollegeService collegeService =new CollegeService();
		College college =new College();
		
		while(true) {
			System.out.println("1.Insert\n2.update\n3.delete\n4.display\n5.addBatch\n5.exit");
			System.out.println("give your own option");
			int ch= sc.nextInt();
			
			switch(ch) {
			
			case 1: {
				System.out.println("insert the id");
				college.setId(sc.nextInt());
				
				System.out.println("insert the name");
				college.setName(sc.next());
				
				System.out.println("insert the city");
				college.setCity(sc.next());
				
				System.out.println("insert the pincode");
				college.setPincode(sc.nextDouble());
				
				collegeService.insertCollege(college);
			}
			break;
			
			case 2: {
				System.out.println("insert the id");
				int id= sc.nextInt();
				System.out.println("insert the name");
				String name= sc.next();
				System.out.println("insert the city");
				String city= sc.next();
				System.out.println("insert the pincode");
				Double pincode= sc.nextDouble();
				
				collegeService.updateCollege(id, name, city, pincode);
			}
			break;
			
			case 3: {
				System.out.println("provide the id to delete");
				int id= sc.nextInt();
				
				collegeService.deleteCollege(id);
			}
			break;
			
			case 4: {
				List<College> College=collegeService.displayCollege();
				for(College college2 : College) {
					System.out.println("College Id="+college2.getId());
					System.out.println("College Name="+college2.getName());
					System.out.println("College Players="+college2.getCity());
					System.out.println("College Country="+college2.getPincode());
					System.out.println("===========================================");
			}
			}
				break;
				
			case 5: {
				System.out.println("how many college you want to insert?");
				
				int size=sc.nextInt();
				
				List<College> colleges = new ArrayList<College>();
				
				for(int i=0;i<size;i++)
				{
					College college2 = new College();
					
					System.out.println("Enter the ID");
					college2.setId(sc.nextInt());
					
					System.out.println("Enter the name");
					college2.setName(sc.next());
					
					System.out.println("Enter the city");
					college2.setCity(sc.next());
					
					System.out.println("Enter the pincode");
					college2.setPincode(sc.nextDouble());
					
					
					colleges.add(college2);
				}
				collegeService.insertAddBatch(colleges);
			}
				
				case 6: {
					System.exit(0);
				}
			}
			
	}
}
}