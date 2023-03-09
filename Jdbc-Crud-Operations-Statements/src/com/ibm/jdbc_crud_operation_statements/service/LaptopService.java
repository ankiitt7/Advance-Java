package com.ibm.jdbc_crud_operation_statements.service;

import java.util.List;

import com.ibm.jdbc_crud_operations_statements.dao.LaptopDao;
import com.ibm.jdbc_crud_operations_statements.dto.Laptop;

public class LaptopService {
		LaptopDao dao=new LaptopDao();
		public void insertLaptop(Laptop laptop)
		{
			if(laptop.getPrice()<40000)
			{
				dao.insertLaptop(laptop);
			}
			else
			{
				System.out.println("Price is too high");
			}
		}
		public void updateLaptopName(Laptop laptop) {
			dao.updateLaptopName(laptop);
			
		}
		public void updateLaptopPrice(Laptop laptop) {
			if(laptop.getPrice()<40000)
			{
				dao.updateLaptopPrice(laptop);
			}
			else
			{
				System.out.println("Price is too high");
			}
			
		}
		public void updateLaptopColor(Laptop laptop) {
			dao.updateLaptopColor(laptop);
		}
		public void deleteLaptop(Laptop laptop) {
			dao.deleteLaptop(laptop);
		}
		public List<Laptop> displayLaptop() {
			return dao.displayLaptop();
		}
}
