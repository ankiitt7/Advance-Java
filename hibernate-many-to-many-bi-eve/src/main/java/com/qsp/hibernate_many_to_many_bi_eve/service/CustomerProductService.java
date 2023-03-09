package com.qsp.hibernate_many_to_many_bi_eve.service;

import java.util.List;

import com.qsp.hibernate_many_to_many_bi_eve.dao.CustomerProductDao;
import com.qsp.hibernate_many_to_many_bi_eve.dto.Customer;
import com.qsp.hibernate_many_to_many_bi_eve.dto.Product;

public class CustomerProductService {

	CustomerProductDao dao=new CustomerProductDao();
	
	public void insertCustomerProduct(List<Customer>customer,List<Product>product)
	{
		dao.insertCustomerProduct(customer, product);
	}
	public void deleteCustomerProductJPQL(int id)
	{
		dao.deleteCustomerProductJPQL(id);
	}
	
}
