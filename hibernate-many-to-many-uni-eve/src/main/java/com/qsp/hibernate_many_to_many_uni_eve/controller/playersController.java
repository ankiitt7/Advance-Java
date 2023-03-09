package com.qsp.hibernate_many_to_many_uni_eve.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.qsp.hibernate_many_to_many_uni_eve.dto.players;
import com.qsp.hibernate_many_to_many_uni_eve.service.playersService;

public class playersController {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	playersService Service=new playersService();
	
	while(true)
	{
		System.out.println("1.Insert/n2.Display/n3.Delete/n4.Display/n5.Exit");
		System.out.println("Enter your choice");
		switch(sc.nextInt())
		{
		case 1:
		{
			List<players> Players=new ArrayList<players>();
			System.out.println("Enter no. of players");
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				players players=new players();
				System.out.println("Enter the player Id");
				players.setPlayerId(sc.nextInt());
				System.out.println("Enter the player Name");
				players.setPlayerName(sc.next());
				System.out.println("Enter the age");
				players.setPlayerAge(sc.nextInt());
				System.out.println("Enter the Team");
				players.setPlayerTeam(sc.next());
				System.out.println("Enter the player country");
				players.setPlayerCountry(sc.next());
				Players.add(players);
			}
			Service.insertPlayers(Players);
		}
		}
	}
}
}
