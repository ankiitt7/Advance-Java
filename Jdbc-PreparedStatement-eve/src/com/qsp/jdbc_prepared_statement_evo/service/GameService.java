package com.qsp.jdbc_prepared_statement_evo.service;

import java.util.List;

import com.qsp.jdbc_prepared_statement_evo.dao.GameDao;
import com.qsp.jdbc_prepared_statement_evo.dto.Game;

public class GameService {
	
	GameDao dao=new GameDao();
	
	public void insertGame(Game game) {
		dao.insertGame(game);
	}
	
	public void updateGame(int id, String name, double players, String country)
	{
		dao.updateGame(id, name, players, country);
	}
	public void deleteGame(int id)
	{
		dao.deleteGame(id);
	}
	
	public List<Game> displayGame(){
		return dao.displayGame();
	}
}
