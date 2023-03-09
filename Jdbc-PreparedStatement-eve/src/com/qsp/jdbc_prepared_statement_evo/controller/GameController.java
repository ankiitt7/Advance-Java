package com.qsp.jdbc_prepared_statement_evo.controller;

import java.util.List;
import java.util.Scanner;

import com.qsp.jdbc_prepared_statement_evo.dto.Game;
import com.qsp.jdbc_prepared_statement_evo.service.GameService;

public class GameController {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	GameService gameService= new GameService();
	Game game=new Game();
	
	while(true) {
		System.out.println("1.Insert\n2.update\n3.delete\n4.display\n5.exit");
		System.out.println("give your own option");
		int ch= sc.nextInt();
		
		switch(ch) {
		
		case 1: {
			System.out.println("insert the game id");
			game.setId(sc.nextInt());
			System.out.println("insert the name");
			game.setName(sc.next());
			System.out.println("insert the players");
			game.setPlayers(sc.nextDouble());
			System.out.println("insert the country");
			game.setCountry(sc.next());
			
			gameService.insertGame(game);
		}
		
		case 2: {
			System.out.println("insert the game id");
			int id= sc.nextInt();
			System.out.println("insert the name");
			String name= sc.next();
			System.out.println("insert the players");
			double players= sc.nextDouble();
			System.out.println("insert the country");
			String country= sc.next();
			
			gameService.updateGame(id, name, players, country);
		}
		break;
		
		case 3: {
			System.out.println("provide the game id to delete");
			int id= sc.nextInt();
			
			gameService.deleteGame(id);
		}
		break;
		
		case 4: {
			List<Game> Game=gameService.displayGame();
			for(Game game2 : Game) {
				System.out.println("Game Id="+game2.getId());
				System.out.println("Game Name="+game2.getName());
				System.out.println("Game Players="+game2.getPlayers());
				System.out.println("Game Country="+game2.getCountry());
				System.out.println("===========================================");
		}
		}
			break;
			
			case 5: {
				System.exit(0);
			}
		}
	}

}
}


