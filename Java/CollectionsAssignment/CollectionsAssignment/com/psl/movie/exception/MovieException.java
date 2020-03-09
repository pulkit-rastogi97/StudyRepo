package com.psl.movie.exception;

public class MovieException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	public MovieException(String msg)
	{
		super(msg);
		this.msg=msg;	
	}
	@Override
	public String toString() {
		return "MovieException [msg=" + msg + "]";
	}
}
