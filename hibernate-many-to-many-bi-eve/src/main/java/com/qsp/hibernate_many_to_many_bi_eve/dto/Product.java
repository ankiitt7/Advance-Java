package com.qsp.hibernate_many_to_many_bi_eve.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product {
	@Id
	private int ProductId;
	private String ProductName;
	private Double ProductPrice;
	
	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public Double getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(Double productPrice) {
		ProductPrice = productPrice;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	@ManyToMany
	List<Customer>customer;
}
