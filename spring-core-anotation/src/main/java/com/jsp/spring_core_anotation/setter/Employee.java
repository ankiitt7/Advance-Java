package com.jsp.spring_core_anotation.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value="myEmployee")
public class Employee {

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	private int id;
	private String name;
	private String email;
	public int getId() {
		return id;
	}
	
	@Value(value="123")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	@Value(value="Ankit")
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	
	@Value(value="ankit@saini")
	public void setEmail(String email) {
		this.email = email;
	}
	
}
