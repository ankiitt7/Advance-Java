package com.spring_core_crud_operation_with_annotation.dto;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;

@Entity
@Table(name="myteam")
@Component(value="team")
public class Team {

	@Id
	@Column(name="teamid",nullable=false)
	private int id;
	@Column(name="teamname")
	private String name;
	@Column(name="teamrank")
	private int rank; 
	@Column(name="teamleader")
	private String leader;
	@UpdateTimestamp
	private LocalDateTime dateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	
	

}
