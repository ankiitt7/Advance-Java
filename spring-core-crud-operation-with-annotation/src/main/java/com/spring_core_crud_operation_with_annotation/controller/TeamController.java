package com.spring_core_crud_operation_with_annotation.controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring_core_crud_operation_with_annotation.MyConfig;
import com.spring_core_crud_operation_with_annotation.dto.Team;
import com.spring_core_crud_operation_with_annotation.service.TeamService;


public class TeamController {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		TeamService service=(TeamService) applicationContext.getBean("service");
		Team team=(Team) applicationContext.getBean("team");
		
		team.setId(101);
		team.setName("India");
		team.setLeader("Virat");
		team.setRank(1);
		
	}
}
