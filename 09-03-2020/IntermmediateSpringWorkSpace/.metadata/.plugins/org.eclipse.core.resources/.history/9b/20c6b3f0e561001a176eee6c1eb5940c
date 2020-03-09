package com.psl.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TransferAspect {

	@Around("execution(* com.psl.aop.BankImpl.transfer(int,int,double)) and args(creditActNo,debitActNo,Amt)")
	public void transferTransaction(ProceedingJoinPoint jp, int creditActNo, int debitActNo, double Amt)
	{
		System.out.println("transferTransaction....... before");
		try
		{
			jp.proceed(); //Mandatory 
		}catch(Throwable e)
		{
			e.printStackTrace();
		}
		System.out.println("transferTransaction..... after");
	}
}
