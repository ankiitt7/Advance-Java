package com.ty.spring_core_simple_xml_project_setter_getter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class StudentDetailDriver {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
	StudentDetails studentDetails=(StudentDetails) applicationContext.getBean("setterinjection");
	System.out.println(studentDetails.toString());
}
}
