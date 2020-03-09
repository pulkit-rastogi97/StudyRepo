package com.psl.userDb.service;

import com.psl.userDb.dao.UserDao;
import com.psl.userDb.dto.UserDetails;

public class UserServiceImpl implements UserService{

	UserDao dao;
	public UserServiceImpl() {
		System.out.println("service constructor");
	}
	public void setDao(UserDao dao)
	{
		System.out.println("set dao");
		this.dao=dao;
	}
	@Override
	public UserDetails addUser(UserDetails obj) throws Exception {
		return dao.addUser(obj);
	}

	@Override
	public UserDetails deleteUser(UserDetails obj) {
		return null;
	}

	@Override
	public UserDetails updateUser(UserDetails obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
