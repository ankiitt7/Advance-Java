package com.qsp.hibernate_simple_crud_operations.Controller;

import java.util.Scanner;



import com.qsp.hibernate_simple_crud_operations.dto.Train;
import com.qsp.hibernate_simple_crud_operations.service.TrainService;

public class TrainController {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	TrainService trainService=new TrainService();
	
	
	Train train =null;
	while(true)
	{
		System.out.println("n1.Insert/n2.Update/n3.Delete/n4.Display/n5.exit");
		System.out.println("Enter your choice");
	
		switch(sc.nextInt())
		{
		case 1:
		{
			train=new Train();
			System.out.println("Enter the train id");
			train.setTrainId(sc.nextInt());
			
			System.out.println("Enter the train name");
			train.setTrainName(sc.next());
			
			System.out.println("Enter the train coaches");
			train.setTrainCoaches(sc.nextInt());
			trainService.trainInsert(train);
			
		}
		break;
		
		case 2:
		{
			System.out.println("1.UpdateEverything\n2.UpdateName\n3.UpdateTrainCoaches");
			System.out.println("Choose your option");
			
			int ch=sc.nextInt();
			
			switch(ch) {
			
			case 1:{
				Train train2=new Train();
				System.out.println("Enter the ID to Update");
				int id=sc.nextInt();
				
				System.out.println("Enter the new name of train");
				train2.setTrainName(sc.next());
				
				System.out.println("Enter the coaches");
				train2.setTrainCoaches(sc.nextInt());
				trainService.trainUpadte(id, train2);
			}
			break;
			case 2: {
				Train train2=new Train();
				System.out.println("Enter the ID to Update");
				int id=sc.nextInt();
				
				System.out.println("Enter the new name of train");
				train2.setTrainName(sc.next());
				
				trainService.trainUpadte(id, train2);
			}
			break;
			case 3: {
				Train train2=new Train();
				System.out.println("Enter the ID to Update");
				int id=sc.nextInt();
				
				System.out.println("Enter the coaches");
				train2.setTrainCoaches(sc.nextInt());
				trainService.trainUpadte(id, train2);
			}
			break;
			}
		}
		break;
		case 3: {
			System.out.println("Enter the ID you want to delete");
			trainService.deleteTrain(sc.nextInt(),train);
		}
		break;
		case 4: {
			for(Train train2: trainService.displayTrain())
			{
				System.out.println("Train id: "+train2.getTrainId());
				System.out.println("Train Name: "+train2.getTrainName());
				System.out.println("Train Coaches: "+train2.getTrainCoaches());
				
				System.out.println("=====================================================");
			}
		}
		}
	}
}
}
