package com.psl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.bean.User;
import com.psl.dao.LoginDao;


@Service("service")
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDao dao;
	
	@Override
	public boolean validateUser(User user) {
		return dao.validateUser(user);
	}

}