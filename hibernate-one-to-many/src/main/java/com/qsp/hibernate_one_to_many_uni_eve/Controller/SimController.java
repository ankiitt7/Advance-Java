package com.qsp.hibernate_one_to_many_uni_eve.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.qsp.hibernate_one_to_many_uni_eve.dto.Sim;
import com.qsp.hibernate_one_to_many_uni_eve.service.SimService;

public class SimController {
	public static void main(String[] args) 
	{
	Scanner scanner=new Scanner(System.in);
	
	SimService service=new SimService();
	while(true)
		{
		System.out.println("1.Insert/n2.Display/n3.Delete/n4.Display/n5.Exit");
		System.out.println("Enter your choice");
		switch(scanner.nextInt())
			{
				case 1:
				{	
					List<Sim> sims=new ArrayList();
					System.out.println("Enter no. of sims");
					int n=scanner.nextInt();
					for(int i=0;i<n;i++)
					{
						Sim sim=new Sim ();
						System.out.println("Enter sim id ");
						sim.setSimId(scanner.nextInt());
						System.out.println("Enter comp name ");
						sim.setCompanyName(scanner.next());
						System.out.println("Enter sim type ");
						sim.setSimNetworkType(scanner.next());
						System.out.println("Enter sim size ");
						sim.setSimsize(scanner.next());
						sims.add(sim);
					}
					service.insertSim(sims);
				}
				case 2:
				{
					List<Sim> sims=service.getAllSims();
					for (Sim sim2 : sims) {
					System.out.println(sim2.getSimId());
					System.out.println(sim2.getCompanyName());
					System.out.println(sim2.getSimNetworkType());
					System.out.println(sim2.getSimSize());
					}	
				}break;
			}
		}
	

	}

}
