package com.psl.aop;

import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import com.psl.bean.Employee;

@Aspect
public class InsertAspect {

	@Around("execution(* com.psl.dao.EmployeeI.insertEmployee(..))")
	public void insertTransaction(ProceedingJoinPoint jp)
	{
		//List<Employee> emp = null;
		System.out.println("insert transaction ...... before ");
		try
		{ 
			// emp =(List<Employee>) jp.proceed();
			 jp.proceed();
		}catch(Throwable e)
		{
			e.printStackTrace();
		}
		System.out.println("insert transaction ...... after");

	}
}
