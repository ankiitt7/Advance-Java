package com.ty.spring_core_simple_xml_project_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopDriver {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
	Laptop laptop=(Laptop) applicationContext.getBean("constructorinjection");
	System.out.println(laptop.toString());
}
}
