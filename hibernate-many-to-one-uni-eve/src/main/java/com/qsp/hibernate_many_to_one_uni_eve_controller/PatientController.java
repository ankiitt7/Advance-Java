package com.qsp.hibernate_many_to_one_uni_eve_controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.qsp.hibernate_many_to_one_uni_eve_dto.Hospital;
import com.qsp.hibernate_many_to_one_uni_eve_dto.Patient;
import com.qsp.hibernate_many_to_one_uni_eve_service.PatientService;

public class PatientController {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		PatientService patientService=new PatientService();
		System.out.println("1.Insert Patients_&_Hospital/n2.Update/n3.Delete/n4.Display/n5.Exit");
		System.out.println("Choose your choice");
		switch(scanner.nextInt())
		{
		case 1:
			{
				Hospital hospital=new Hospital();
				System.out.println("Enter Hospital id");
				hospital.setId(scanner.nextInt());
				System.out.println("Enter Hospital name");
				hospital.setName(scanner.next());
				System.out.println("Enter Hospital address");
				hospital.setAddress(scanner.next());
				System.out.println("Enter no. of patients ");
				int size=scanner.nextInt();
				List <Patient> patients=new ArrayList();
				for(int i=0;i<size;i++)
				{
						Patient patient=new Patient();
						System.out.println("Enter patient id");
						patient.setId(scanner.nextInt());
						System.out.println("Enter patient name");
						patient.setName(scanner.next());
						System.out.println("Enter patient age");
						patient.setAge(scanner.nextInt());
						System.out.println("Enter patient gender");
						patient.setGender(scanner.next());
						patient.setHospital(hospital);
						patients.add(patient);
				}
				patientService.insertHospitalPatient(patients, hospital);
			}break;
		case 2:
			{
				System.out.println("Enter patient id to update");
				int patientId=scanner.nextInt();
				System.out.println("enter pateing gender to update ");
				String patientGender=scanner.next();
				System.out.println("Enter hospital id to update");
				int hospitalId=scanner.nextInt();
				System.out.println("Enter hospital name to update");
				String hospitalName=scanner.next();
				patientService.updatePatientHospital(patientId, patientGender, hospitalId, hospitalName);
			
			}break;
		case 3:
			{
//				We can not delete patients having foreign key of hospital
				System.out.println("Enter no. of patients to delete");
				int size=scanner.nextInt();
				for(int i=1;i<=size;i++)
				{
				System.out.println("Enter patient id to delete");
				int patientId=scanner.nextInt();
				patientService.deletePatient(patientId);
				}
			}
		case 4:
			List<Patient> patients=patientService.displayPatientHospital();
			for (Patient patient : patients) 
			{
				System.out.println(patient.getId());
				System.out.println(patient.getName());
				System.out.println(patient.getAge());
				System.out.println(patient.getGender());
				System.out.println(patient.getHospital().getId());
				System.out.println(patient.getHospital().getName());
				System.out.println(patient.getHospital().getAddress());	
			}break;
			
		}

	}
}
