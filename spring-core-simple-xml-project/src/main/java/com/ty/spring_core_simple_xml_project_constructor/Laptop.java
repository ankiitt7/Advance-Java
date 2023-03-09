package com.ty.spring_core_simple_xml_project_constructor;

public class Laptop {

	private int id;
	private String name;
	private String color;
	
	public Laptop(int id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
	
}
