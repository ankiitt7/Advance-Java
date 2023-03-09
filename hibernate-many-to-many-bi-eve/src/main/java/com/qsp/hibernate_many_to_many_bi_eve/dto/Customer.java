package com.qsp.hibernate_many_to_many_bi_eve.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Customer {
	@Id
	private int CustomerId;
	private String CustomerName;
	private String CustomerAddress;
	private Long CustomerMobile;
	
	@ManyToMany
	List<Product>product;

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}

	public Long getCustomerMobile() {
		return CustomerMobile;
	}

	public void setCustomerMobile(Long customerMobile) {
		CustomerMobile = customerMobile;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
}
