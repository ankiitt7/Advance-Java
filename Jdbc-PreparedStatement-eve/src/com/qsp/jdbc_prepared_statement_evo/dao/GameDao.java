package com.qsp.jdbc_prepared_statement_evo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qsp.jdbc_prepared_statement_evo.connection.GameConnection;

import com.qsp.jdbc_prepared_statement_evo.dto.Game;


public class GameDao {
Connection connection = null;
	
	public void insertGame(Game game) {
		connection=GameConnection.getConnection();
		
		String insert= "insert into game values(?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insert);
			
			preparedStatement.setInt(1,game.getId());
			preparedStatement.setString(2,game.getName());
			preparedStatement.setDouble(3,game.getPlayers());
			preparedStatement.setString(4,game.getCountry());
			
			preparedStatement.execute();
			
			System.out.println("data inserted.............");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void updateGame(int id, String name, double players, String country)
	{
		connection=GameConnection.getConnection();
		
		String update= "update game set name=?, players=?, country=? where id=?";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(update);
			preparedStatement.setInt(4,id);
			preparedStatement.setString(1,name);
			preparedStatement.setDouble(2,players);
			preparedStatement.setString(3,country);
			
			preparedStatement.executeUpdate();
			
			System.out.println("data updated........");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteGame(int id)
	{
		connection=GameConnection.getConnection();
		String delete="delete from game where id=?";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(delete);
			preparedStatement.setInt(1,id);
			
			preparedStatement.executeUpdate();
			
			System.out.println("data deleted..........");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Game> displayGame() {
		connection=GameConnection.getConnection();
		String select= "select * from game";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(select);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			List <Game> list=new ArrayList<Game>();
			while(resultSet.next()) {
				Game game=new Game();
				game.setId(resultSet.getInt("id"));
				game.setName(resultSet.getString("name"));
				game.setPlayers(resultSet.getDouble("players"));
				game.setCountry(resultSet.getString("country"));
				
				list.add(game);
				
			}
			return list;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
}
