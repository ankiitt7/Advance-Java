package com.qsp.hibernate_many_to_many_uni_eve.service;

import java.util.List;

import com.qsp.hibernate_many_to_many_uni_eve.dao.playersDao;
import com.qsp.hibernate_many_to_many_uni_eve.dto.players;

public class playersService {

	playersDao playersDao=new playersDao();
	
	public void insertPlayers(List <players>Players)
	{
		playersDao.insertPlayers(Players);
	}
}
