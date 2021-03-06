package com.psl.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logger {

	
	public void go()
	{
		System.out.println("go method");
	}
	
	@Before("execution(* com.psl.aop.BankImpl.g*(*))")
	public void logBefore()
	{
		System.out.println("logBefore method");
	}
	
	@After("execution(* com.psl.aop.BankImpl.g*(*))")
	public void logAfter()
	{
		System.out.println("logAfter method");
	}
	
	@AfterThrowing("execution(* com.psl.aop.BankImpl.g*(*))")
	public void logError()
	{
		System.out.println("logError method");
	}
	
	@AfterReturning("execution(* com.psl.aop.BankImpl.g*(*))")
	public void success()
	{
		System.out.println("Success method");
	}
	
}
