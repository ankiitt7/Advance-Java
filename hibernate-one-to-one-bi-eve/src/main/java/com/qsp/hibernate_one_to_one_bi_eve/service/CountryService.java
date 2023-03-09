package com.qsp.hibernate_one_to_one_bi_eve.service;

import java.util.List;

import com.qsp.hibernate_one_to_one_bi_eve.dao.CountryCapitalDao;
import com.qsp.hibernate_one_to_one_bi_eve.dto.Capital;
import com.qsp.hibernate_one_to_one_bi_eve.dto.Country;

public class CountryService 
{
	CountryCapitalDao dao=new CountryCapitalDao();
	
	
	public void insertCountryCapital(Country country, Capital capital)
	{
		dao.insertCountryCapital(country, capital);
	}
	
	public List<Capital> displayCountryCapital()
	{
		return dao.displayCountryCapital();
	}
	
	public void updateCountryCapital(int capitalId,String countryName)
	{
		dao.updateCountryCapital(capitalId, countryName);
	}
	
	public void deleteCountryCapital(int capitalId)
	{
		dao.deleteCountryCapital(capitalId);
	}
}
