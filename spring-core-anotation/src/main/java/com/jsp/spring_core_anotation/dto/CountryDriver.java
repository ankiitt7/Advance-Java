package com.jsp.spring_core_anotation.dto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CountryDriver {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(CountryConfig.class);
	Country country=(Country) applicationContext.getBean("mycountry");
	country.getCountryDetails();
}
}
