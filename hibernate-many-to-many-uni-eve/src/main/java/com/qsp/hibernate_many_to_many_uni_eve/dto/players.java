package com.qsp.hibernate_many_to_many_uni_eve.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class players {
	
	@Id
	private int PlayerId;
	private String PlayerName;
	private int PlayerAge;
	private String PlayerTeam;
	private String PlayerCountry;
	public int getPlayerId() {
		return PlayerId;
	}
	public void setPlayerId(int playerId) {
		PlayerId = playerId;
	}
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	public int getPlayerAge() {
		return PlayerAge;
	}
	public void setPlayerAge(int playerAge) {
		PlayerAge = playerAge;
	}
	public String getPlayerTeam() {
		return PlayerTeam;
	}
	public void setPlayerTeam(String playerTeam) {
		PlayerTeam = playerTeam;
	}
	public String getPlayerCountry() {
		return PlayerCountry;
	}
	public void setPlayerCountry(String playerCountry) {
		PlayerCountry = playerCountry;
	}
	
	
	
}
