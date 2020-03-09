package com.psl.game.service;

import java.util.HashMap;

import com.psl.game.dao.GameDao;
import com.psl.game.dto.Game;
import com.psl.game.exception.GameException;

public class GameServiceImpl implements GameService{

	GameDao game ;
	public GameServiceImpl()
	{
		
	}
	public void setDao(GameDao obj)
	{
		this.game = obj;
	}
	@Override
	public HashMap<String, Integer> getAllGameDetails() {
		return game.getAllGameDetails();
	}

	@Override
	public Game playGame(int userId, String gameName) throws GameException {
		return game.playGame(userId, gameName);
	}

}
