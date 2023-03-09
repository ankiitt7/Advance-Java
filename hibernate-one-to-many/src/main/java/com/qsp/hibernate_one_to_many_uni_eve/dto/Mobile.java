package com.qsp.hibernate_one_to_many_uni_eve.dto;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mobile {
	
	@Id
	private int MobileId;
	private String MobileBrandName;
	private String MobileColor;
	private String MobilePrice;
	
	@OneToMany
	private List<Sim> sims;

	public int getMobileId() {
		return MobileId;
	}

	public void setMobileId(int MobileId) {
		this.MobileId = MobileId;
	}

	public String getMobileBrandName() {
		return MobileBrandName;
	}

	public void setMobileBrandName(String mobileBrandName) {
		MobileBrandName = mobileBrandName;
	}

	public String getMobileColor() {
		return MobileColor;
	}

	public void setMobileColor(String mobileColor) {
		MobileColor = mobileColor;
	}


	public String getMobilePrice() {
		return MobilePrice;
	}

	public void setMobilePrice(String mobilePrice) {
		MobilePrice = mobilePrice;
	}

	public List<Sim> getSims() {
		return sims;
	}

	public void setSims(List<Sim> sims) {
		this.sims = sims;
	}
	
}
