package com.jsp.spring_core_anotation.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring_core_anotation.dto.CountryConfig;

public class EmployeeDriver {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(CountryConfig.class);
	Employee employee=(Employee) applicationContext.getBean("myEmployee");
	System.out.println(employee.toString());
}
}
