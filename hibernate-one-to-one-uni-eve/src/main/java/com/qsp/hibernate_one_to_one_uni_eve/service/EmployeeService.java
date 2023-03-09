package com.qsp.hibernate_one_to_one_uni_eve.service;

import java.util.List;

import com.qsp.hibernate_one_to_one_uni_eve.dao.EmployeeDao;
import com.qsp.hibernate_one_to_one_uni_eve.dto.Employee;
import com.qsp.hibernate_one_to_one_uni_eve.dto.Laptop;

public class EmployeeService {

	EmployeeDao employeeDao=new EmployeeDao();
	
	public void insertEmployee(Employee employee ,Laptop laptop)
	{
		employeeDao.insertEmployee(employee, laptop);
	}
	
	public void updateLaptopEmployee(Employee employee, Laptop laptop, int id1)
	{
		employeeDao.updateLaptopEmployee(employee, laptop, id1);
	}
	public void deleteLaptopEmployee(int id)
	{
		employeeDao.deleteLaptopEmployee(id);
	}
	public List<Employee> displayEmployeeLaptop()
	{
		return employeeDao.displayEmployeeLaptop();
	}
}
