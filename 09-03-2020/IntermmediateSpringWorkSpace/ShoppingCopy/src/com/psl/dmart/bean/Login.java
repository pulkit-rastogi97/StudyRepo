package com.psl.dmart.bean;

import org.hibernate.validator.constraints.NotEmpty;


public class Login {

	@NotEmpty(message="UserId can't be empty")
	private String userId;
	
	@NotEmpty(message="Password should not be null")
	private String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Login()
	{
		
	}

	public Login(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [userId=" + userId + ", password=" + password + "]";
	}
	
	
}
