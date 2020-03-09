package com.psl.userDb.pl;

import com.psl.userDb.dao.UserDao;
import com.psl.userDb.dao.UserDaoImpl;
import com.psl.userDb.dto.UserDetails;
import com.psl.userDb.service.UserServiceImpl;

public class MainClass {

	public static void main(String[] args) throws Throwable {
		
		UserDao dao = new UserDaoImpl();
		UserServiceImpl service = new UserServiceImpl();
		
		service.setDao(dao);
		
		UserDetails ref = new UserDetails("Pulkit","1234");
		service.addUser(ref);
		
	}
}
