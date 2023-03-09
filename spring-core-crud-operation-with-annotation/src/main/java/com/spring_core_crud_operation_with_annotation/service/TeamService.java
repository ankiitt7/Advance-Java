package com.spring_core_crud_operation_with_annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring_core_crud_operation_with_annotation.dao.TeamDao;
import com.spring_core_crud_operation_with_annotation.dto.Team;
@Component(value="service")
public class TeamService {

	@Autowired
	TeamDao teamDao;
	
	public void insertTeam(Team team)
	{
		teamDao.insertTeam(team);
	}
}
