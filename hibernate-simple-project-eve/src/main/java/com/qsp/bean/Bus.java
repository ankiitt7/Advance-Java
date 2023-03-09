package com.qsp.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bus {
	@Id
	private int id;
	private String name;
	private String speed;
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
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	
	
	
}
