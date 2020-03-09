package com.psl.exception;

public class EmployeeException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg ;
	
	public EmployeeException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
	@Override
	public String toString() {
		return msg;
	}
	
	
}
