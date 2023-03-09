package com.ty.spring_core_simple_xml_project;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MySpring1Driver {
public static void main(String[] args) {
	ClassPathResource classPathResource=new ClassPathResource("myspring.xml"); //create path
	BeanFactory beanFactory=new XmlBeanFactory(classPathResource); //line cut because no mandatory to write,beanfactory create ioc container
	MySpring1 mySpring1= (MySpring1) beanFactory.getBean("MySpring");
	mySpring1.MySpring();
}
}
