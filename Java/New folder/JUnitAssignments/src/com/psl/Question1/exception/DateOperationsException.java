package com.psl.Question1.exception;

public class DateOperationsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6529550943414218672L; 
	
	String msg;
	public DateOperationsException(String msg)
	{
		super(msg);
		this.msg=msg;
	}
	

}
