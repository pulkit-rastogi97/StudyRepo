package com.psl.aop;

public interface IBank {

	public void transfer(int creditActNo, int debitactNo, double amt);
	public double getBalance(int accNo) throws ArithmeticException;
	public boolean validateCard(int cardNo);
	
}
