package com.qsp.hibernate_one_to_one_bi_eve.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Capital {

	@Id
	private int capitalId;
	private String capitalName;
	private String capitalPopulation;
	
	@OneToOne (mappedBy="capital")
	private Country country;
	
	public int getCapitalId() {
		return capitalId;
	}

	public void setCapitalId(int capitalId) {
		this.capitalId = capitalId;
	}

	public String getCapitalName() {
		return capitalName;
	}

	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}

	public String getCapitalPopulation() {
		return capitalPopulation;
	}

	public void setCapitalPopulation(String capitalPopulation) {
		this.capitalPopulation = capitalPopulation;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	
}
