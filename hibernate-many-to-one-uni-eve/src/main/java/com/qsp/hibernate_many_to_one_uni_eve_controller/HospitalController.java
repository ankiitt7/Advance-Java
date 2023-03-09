package com.qsp.hibernate_many_to_one_uni_eve_controller;

import java.util.List;
import java.util.Scanner;

import com.qsp.hibernate_many_to_one_uni_eve_dto.Hospital;
import com.qsp.hibernate_many_to_one_uni_eve_service.HospitalService;

public class HospitalController {

	public static void main(String[] args) 
	{
			Scanner scanner=new Scanner(System.in);
			Hospital hospital=new Hospital();
			HospitalService hospitalService=new HospitalService();
			System.out.println("1.Insert_Hospital/n2.Update/n3.Delete/n4.Display/n5.Exit");
			System.out.println("Choose your choice");
			switch(scanner.nextInt())
			{
			case 1:
				{
					System.out.println("Enter hospital id");
					hospital.setId(scanner.nextInt());
					System.out.println("Enter Hospital name");
					hospital.setName(scanner.next());
					System.out.println("Enter Hospital Address");
					hospital.setAddress(scanner.next());
					hospitalService.insertHospital(hospital);
				}break;
			case 2:
				{
					System.out.println("Enter hospital id to update");
					int hospitalId=scanner.nextInt();
					System.out.println("Enter hospital name to update");
					hospital.setName(scanner.next());
					System.out.println("Enter hospital address to update");
					hospital.setAddress(scanner.next());
					hospitalService.updateHospital(hospitalId, hospital);
				}break;
			case 3:
				{
//					We can not delete hospital which is foreign key of patient
					System.out.println("Enter Hospital id to delete");
					int hospitalId=scanner.nextInt();
					hospitalService.deleteHospital(hospitalId);
				}break;
			case 4:
				{
					List<Hospital> hospitals=hospitalService.displayHospital();
					for (Hospital hospital2 : hospitals) 
					{
						System.out.println(hospital2.getId());
						System.out.println(hospital2.getName());
						System.out.println(hospital2.getAddress());
					}break;
				}
			}
	}
}
