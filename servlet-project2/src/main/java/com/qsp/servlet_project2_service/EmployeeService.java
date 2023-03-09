package com.qsp.servlet_project2_service;

import com.qsp.servlet_project2_dao.EmployeeDao;
import com.qsp.servlet_project2_dto.Employee;

public class EmployeeService {
	
	EmployeeDao dao=new EmployeeDao();
	

	public void insertEmployee(Employee employee)
	{
		dao.insertEmployee(employee);
	}

}
