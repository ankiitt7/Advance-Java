package com.qsp.jdbc_prepared_statement_evo.dto;

public class Game {

	private int id;
	private String name;
	private Double players;
	private String country;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPlayers() {
		return players;
	}
	public void setPlayers(Double players) {
		this.players = players;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
