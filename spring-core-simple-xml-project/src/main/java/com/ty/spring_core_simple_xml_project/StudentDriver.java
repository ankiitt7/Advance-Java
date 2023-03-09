package com.ty.spring_core_simple_xml_project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
	Student student=(Student) applicationContext.getBean("saini");
	student.studentDetail();
}
}
