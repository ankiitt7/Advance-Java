package com.ibm.jdbc_crud_operations_statements.dto;

public class Laptop {
		private int id;
		private String name;
		private int price;
		private String color;
		
		
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
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String toString() 
		{
			return getName()+" "+getId()+" "+getPrice()+" "+getColor()+" ";
		}
		
		
}
