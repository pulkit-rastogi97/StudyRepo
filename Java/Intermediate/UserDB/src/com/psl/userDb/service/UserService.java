package com.psl.userDb.service;

import com.psl.userDb.dto.UserDetails;

public interface UserService {
	public UserDetails addUser(UserDetails obj) throws Exception;
	public UserDetails deleteUser(UserDetails obj);
	public UserDetails updateUser(UserDetails obj);
}
