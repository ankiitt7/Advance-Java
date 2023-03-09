package com.jsp.spring_core_anotation.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="mycountry")
public class Country {

	@Value(value="+91")
	private int a;
	@Value(value="India")
	private String name;
	@Value(value="New Delhi")
	private String capital;
	
	
	public void getCountryDetails()
	{
		System.out.println("CountryCode="+a);
		System.out.println("CountryName="+name);
		System.out.println("CountryCapital="+capital);
	}
}
