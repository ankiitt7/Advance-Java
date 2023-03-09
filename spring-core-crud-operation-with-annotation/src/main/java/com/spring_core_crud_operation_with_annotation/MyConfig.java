package com.spring_core_crud_operation_with_annotation;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value="com.spring_core_crud_operation_with_annotation")
public class MyConfig {

	@Bean
	public EntityManagerFactory getEntityManagerFactory()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
		return entityManagerFactory;
		
	}
}
