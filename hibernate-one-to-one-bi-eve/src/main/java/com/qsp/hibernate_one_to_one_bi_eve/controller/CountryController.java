package com.qsp.hibernate_one_to_one_bi_eve.controller;

import java.util.List;
import java.util.Scanner;


 
import com.qsp.hibernate_one_to_one_bi_eve.dto.Capital;
import com.qsp.hibernate_one_to_one_bi_eve.dto.Country;
import com.qsp.hibernate_one_to_one_bi_eve.service.CountryService;

public class CountryController 
{

	public static void main(String[] args)
	
	{
		Scanner scanner=new Scanner(System.in);
		CountryService countryService= new CountryService();
		Country country=new Country();
		Capital capital=new Capital();
		while(true)
		{
			System.out.println("1.Insert/2.Update/3.Delete/4.Display/5.Exit");
			System.out.println("Choose choose mera .......");
			switch(scanner.nextInt())
			{
			case 1:
					{
						System.out.println("Enter Country Id");
						country.setCountryId(scanner.nextInt());
						System.out.println("Enter Country name");
						country.setCountryName(scanner.next());
						System.out.println("Enter Country Population");
						country.setCountryPopulation(scanner.next());
						
						
						System.out.println("Enter Capital Id");
						capital.setCapitalId(scanner.nextInt());
						System.out.println("Enter Capital name");
						capital.setCapitalName(scanner.next());
						System.out.println("Enter Capital Population");
						capital.setCapitalPopulation(scanner.next());
						
						
						country.setCapital(capital);
						capital.setCountry(country);
						countryService.insertCountryCapital(country, capital);
					}break;
					
			case 2:
			{
				System.out.println("Enter the id to update");
				int id=scanner.nextInt();
				
				System.out.println("Enter the country name to update");
				String name=scanner.next();
				
				countryService.updateCountryCapital(id, name);
			}break;
			
			case 3:
			{
				System.out.println("Enter the capitalId to delete");
				int capitalId=scanner.nextInt();
				
				countryService.deleteCountryCapital(capitalId);
			}break;
			
			case 4:
			{
				List <Capital> list=countryService.displayCountryCapital();
				for(Capital capital2:list)
				{
					System.out.println("Capital Id: "+capital2.getCapitalId());
					System.out.println("Capital Name: "+capital2.getCapitalName());
					System.out.println("Capital population: "+capital2.getCapitalPopulation());
					
				}
			}
			}
		}

	}

}
