package com.qsp.hibernate_one_to_one_bi_eve.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Country {
	@Id
	private int countryId;
	private String countryName;
	private String countryPopulation;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk")
	private Capital capital;

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryPopulation() {
		return countryPopulation;
	}

	public void setCountryPopulation(String countryPopulation) {
		this.countryPopulation = countryPopulation;
	}

	public Capital getCapital() {
		return capital;
	}

	public void setCapital(Capital capital) {
		this.capital = capital;
	}
}
