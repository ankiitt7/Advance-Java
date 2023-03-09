package com.qsp.hibernate_one_to_many_uni_eve.dto;

import javax.persistence.Entity;

@Entity
public class Sim {

	@javax.persistence.Id
	private int SimId;
	private String CompanyName;
	private String SimNetworkType;
	private String SimSize;
	public int getSimId() {
		return SimId;
	}
	public void setSimId(int Simid) {
		this.SimId = Simid;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getSimNetworkType() {
		return SimNetworkType;
	}
	public void setSimNetworkType(String simNetworkType) {
		SimNetworkType = simNetworkType;
	}
	public String getSimSize() {
		return SimSize;
	}
	public void setSimsize(String SimSize) {
		this.SimSize = SimSize;
	}
	
	
	
}
