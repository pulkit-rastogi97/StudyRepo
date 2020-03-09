package com.psl.Question3.exception;

public class StudentException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1421674315215074505L;
	String msg;
	public StudentException(String msg)
	{
		super(msg);
		this.msg=msg;
	}

}
