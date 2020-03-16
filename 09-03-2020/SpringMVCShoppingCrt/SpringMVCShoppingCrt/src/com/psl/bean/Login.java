package com.psl.bean;

import org.hibernate.validator.constraints.NotEmpty;

public class Login {

	@NotEmpty(message="username is required")
	private String username;
	@NotEmpty(message="password is must")
	private String password;
	public String getUsername() {
		return username;
	}
	
	public Login() {
		
		// TODO Auto-generated constructor stub
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + "]";
	}
	
	
	
}
