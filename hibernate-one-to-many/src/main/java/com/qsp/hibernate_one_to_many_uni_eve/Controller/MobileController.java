package com.qsp.hibernate_one_to_many_uni_eve.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.qsp.hibernate_one_to_many_uni_eve.dto.Mobile;
import com.qsp.hibernate_one_to_many_uni_eve.dto.Sim;
import com.qsp.hibernate_one_to_many_uni_eve.service.MobileService;

public class MobileController {


	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		Mobile mobile=new Mobile();
		
		MobileService service=new MobileService();
		while(true)
		{
		System.out.println("1.Insert/n2.InsertMobile&Sim/n3.Delete/n4.Update");
		System.out.println("Enter your choice");
		switch(scanner.nextInt())
		{
		case 1:
			{		
				System.out.println("Enter mobile id");
				mobile.setMobileId(scanner.nextInt());
				System.out.println("Enter mobile brand");
				mobile.setMobileBrandName(scanner.next());
				System.out.println("Enter mobile price");
				mobile.setMobilePrice(scanner.next());
				System.out.println("Enter mobile color");
				mobile.setMobileColor(scanner.next());
				service.insertMobile(mobile);
			}break;
		case 2:
			{
				System.out.println("Enter no. of sims to be inserted");
				int n=scanner.nextInt();
				List<Sim> sims=new ArrayList<Sim>();
				for(int i=0;i<n;i++)
				{
					Sim sim=new Sim();
					System.out.println("Enter sim id");
					sim.setSimId(scanner.nextInt());
					System.out.println("Enter sim brand");
					sim.setCompanyName(scanner.next());
					System.out.println("Enter sim type");
					sim.setSimNetworkType(scanner.next());
					System.out.println("Enter sim size");
					sim.setSimsize(scanner.next());	
					sims.add(sim);
				}
				System.out.println("Enter mobile id");
				mobile.setMobileId(scanner.nextInt());
				System.out.println("enter mobile brand");
				mobile.setMobileBrandName(scanner.next());
				System.out.println("enter mobile price");
				mobile.setMobilePrice(scanner.next());
				System.out.println("enter mobile color");
				mobile.setMobileColor(scanner.next());
				mobile.setSims(sims);
				service.insertMobile1(mobile, sims);	
			}break;
		case 3:
			{
				System.out.println("Enter mobile id to delete");
				int id=scanner.nextInt();
				service.deleteMobile(id);
			}break;
		case 4:
			{
				System.out.println("Enter mobile id to update");
				int id=scanner.nextInt();
				System.out.println("Enter mobile brand to update");
				mobile.setMobileBrandName(scanner.next());
				System.out.println("Enter mobile price");
				mobile.setMobilePrice(scanner.next());
				System.out.println("Enter mobile color");
				mobile.setMobileColor(scanner.next());
				
				List<Sim> sims=new ArrayList<Sim>();	
				for (Sim sim : sims) 
				{
					
					System.out.println("Enter sim brand");
					sim.setCompanyName(scanner.next());
					System.out.println("Enter sim type");
					sim.setSimNetworkType(scanner.next());
					System.out.println("Enter sim size");
					sim.setSimsize(scanner.next());
					sims.add(sim);
				}

				service.updateMobile(mobile, sims, id);
				
				
				
			}
		}
		}
	}

}
