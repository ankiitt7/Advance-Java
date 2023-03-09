package com.qsp.hibernate_many_to_many_bi_eve.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.qsp.hibernate_many_to_many_bi_eve.dto.Customer;
import com.qsp.hibernate_many_to_many_bi_eve.dto.Product;
import com.qsp.hibernate_many_to_many_bi_eve.service.CustomerProductService;

public class CustomerProductController {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 CustomerProductService service=new CustomerProductService();
		 
		 while(true)
		 {
			 System.out.println("1.Insert/n2.Display/n3.Delete/n4.Display/n5.Exit");
			 System.out.println("Enter your choice");
			 
			 switch(sc.nextInt())
			 {
			 case 1:
			 {
				 List<Customer>customer=new ArrayList();
				 List<Product>product=new ArrayList();
				 
				 System.out.println("Enter no of customer you want to put");
				 int size=sc.nextInt();
				 for(int i=0;i<size;i++)
				 {
				 Customer customer2=new Customer();
				 System.out.println("Enter the customer id");
				 customer2.setCustomerId(sc.nextInt());
				 System.out.println("Enter the customer name");
				 customer2.setCustomerName(sc.next());
				 System.out.println("Enter the customer address");
				 customer2.setCustomerAddress(sc.next());
				 System.out.println("Enter the customer mobile");
				 customer2.setCustomerMobile(sc.nextLong());
				 customer2.setProduct(product);
				 customer.add(customer2);
				 }
				 
				 
				 System.out.println("Enter no of product you want to put");
				 int size1=sc.nextInt();
				 for(int i=0;i<size1;i++)
				 {
			     Product product2=new Product();
				 System.out.println("Enter the product id");
				 product2.setProductId(sc.nextInt());
				 System.out.println("Enter the product name");
				 product2.setProductName(sc.next());
				 System.out.println("Enter the product price");
				 product2.setProductPrice(sc.nextDouble());
				 product2.setCustomer(customer);
				 product.add(product2);
				 }
				 
				 service.insertCustomerProduct(customer, product);
				 
				 
			 }break;
			 case 3:
			 {
				 System.out.println("Enter the ID you want to delete");
				 int id=sc.nextInt();
				 service.deleteCustomerProductJPQL(id);
			 }
				 
			 }
		 }
		 
	}
}
