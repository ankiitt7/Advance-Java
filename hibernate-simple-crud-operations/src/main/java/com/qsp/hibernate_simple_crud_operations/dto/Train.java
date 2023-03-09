package com.qsp.hibernate_simple_crud_operations.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Train {
	@Id
	private int TrainId;
	private String TrainName;
	private int TrainCoaches;
	
	
	public int getTrainId() {
		return TrainId;
	}
	public void setTrainId(int trainId) {
		TrainId = trainId;
	}
	public String getTrainName() {
		return TrainName;
	}
	public void setTrainName(String trainName) {
		TrainName = trainName;
	}
	public int getTrainCoaches() {
		return TrainCoaches;
	}
	public void setTrainCoaches(int trainCoaches) {
		TrainCoaches = trainCoaches;
	}
	
	

	
}
