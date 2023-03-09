package com.qsp.hibernate_many_to_many_uni_eve.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class games {
	@Id
	private int GameId;
	private String GameName;
	private String GameDuration;
	
	@ManyToMany
	private List <players>Players;

	public int getGameId() {
		return GameId;
	}

	public void setGameId(int gameId) {
		GameId = gameId;
	}

	public String getGameName() {
		return GameName;
	}

	public void setGameName(String gameName) {
		GameName = gameName;
	}

	public String getGameDuration() {
		return GameDuration;
	}

	public void setGameDuration(String gameDuration) {
		GameDuration = gameDuration;
	}

	public List<players> getPlayers() {
		return Players;
	}

	public void setPlayers(List<players> players) {
		Players = players;
	}
	
}
