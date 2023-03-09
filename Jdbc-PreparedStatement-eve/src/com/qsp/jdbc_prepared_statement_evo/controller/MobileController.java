package com.qsp.jdbc_prepared_statement_evo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.qsp.jdbc_prepared_statement_evo.dto.Mobile;
import com.qsp.jdbc_prepared_statement_evo.service.MobileService;

public class MobileController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MobileService mobileService = new MobileService();
		Mobile mobile = new Mobile();
		while(true) {
			System.out.println("1.Insert\n2.update\n3.delete\n4.display\n5.addBatch\n5.exit");
			System.out.println("give your own option");
			int ch= scanner.nextInt();
			
			switch(ch) {
			
			case 1: {
				System.out.println("insert the mobile id");
				mobile.setMobileId(scanner.nextInt());
				System.out.println("insert the mobileBrand");
				mobile.setMobileBrand(scanner.next());
				System.out.println("insert the mobile price");
				mobile.setMobilePrice(scanner.nextDouble());
				System.out.println("insert the mobile color");
				mobile.setMobileColor(scanner.next());
				System.out.println("insert the mobile camera");
				mobile.setMobileCamera(scanner.next());
				
				mobileService.insertMobile(mobile);
			}
			break;
			
			case 2: {
				System.out.println("insert the mobile id");
				int id= scanner.nextInt();
				System.out.println("insert the mobile color");
				String color= scanner.next();
				System.out.println("insert the mobile price");
				double price= scanner.nextDouble();
				System.out.println("insert the mobile camera");
				String camera= scanner.next();
				
				mobileService.updateMobile(id, color, price, camera);
			}
			break;
			
			case 3: {
				System.out.println("provide your id to delete");
				int id= scanner.nextInt();
				
				mobileService.deleteMobile(id);
			}
			break;
			
			case 4: {
				List<Mobile> Mobile=mobileService.displayMobile();
				for(Mobile mobile2 : Mobile) {
					System.out.println("MobileId="+mobile2.getMobileId());
					System.out.println("MobileBrand="+mobile2.getMobileBrand());
					System.out.println("MobileBrand="+mobile2.getMobilePrice());
					System.out.println("MobileCamera="+mobile2.getMobileCamera());
					
				}
			}
			break;
			
			case 5: {
				System.out.println("how many mobile you want to insert?");
				
				int size=scanner.nextInt();
				
				List<Mobile> mobiles = new ArrayList<Mobile>();
				
				for(int i=0;i<size;i++)
				{
					Mobile mobile2 = new Mobile();
					
					System.out.println("Enter the mobileID");
					mobile2.setMobileId(scanner.nextInt());
					
					System.out.println("Enter the mobileBrand");
					mobile2.setMobileBrand(scanner.next());
					
					System.out.println("Enter the mobilePrice");
					mobile2.setMobilePrice(scanner.nextDouble());
					
					System.out.println("Enter the mobileColor");
					mobile2.setMobileColor(scanner.next());
					
					System.out.println("Enter the mobileCamera");
					mobile2.setMobileCamera(scanner.next());
					
					mobiles.add(mobile2);
				}
				mobileService.insertAddBatch(mobiles);
			}
			break;
			
			case 6: {
				System.exit(0);
			}
			}
			
		}
	}
}
