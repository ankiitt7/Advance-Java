package com.jsp.spring_core_anotation.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring_core_anotation.dto.CountryConfig;

public class LaptopDriver {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(CountryConfig.class);
	Laptop laptop=(Laptop) applicationContext.getBean("mylaptop");
	System.out.println(laptop.toString());
}
}
