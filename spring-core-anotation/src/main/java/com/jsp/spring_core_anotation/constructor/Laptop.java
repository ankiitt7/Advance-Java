package com.jsp.spring_core_anotation.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value="mylaptop")
public class Laptop {

	
	private int id;
	private String name;
	private String color;
	
	
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", color=" + color + "]";
	}


	public Laptop(@Value(value="1")int id, @Value(value="hp")String name, @Value(value="red")String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}
	
	
	
}
