package com.psl.dmart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.dmart.bean.Login;
import com.psl.dmart.dao.LoginDao;


@Service("loginService")
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDao loginDao;
	
	@Override
	public boolean validateUser(Login login) {
		return loginDao.validateUser(login);
	}

	
}
