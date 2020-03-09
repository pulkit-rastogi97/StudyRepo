package com.psl.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class TransferAspect {

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
