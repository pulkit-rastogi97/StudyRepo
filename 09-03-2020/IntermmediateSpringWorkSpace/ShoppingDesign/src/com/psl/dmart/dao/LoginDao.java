package com.psl.dmart.dao;

import com.psl.dmart.bean.Login;

public interface LoginDao {

	public boolean validateUser(Login login);
}
