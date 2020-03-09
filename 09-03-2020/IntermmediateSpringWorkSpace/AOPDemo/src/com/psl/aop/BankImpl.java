package com.psl.aop;

public class BankImpl implements IBank {

	int balance = 10000;
	@Override
	public void transfer(int creditActNo, int debitactNo, double amt) {
		
		System.out.println("transfer initiated");
//		throw new RuntimeException();

	}
	@Override
	public double getBalance(int accNo) throws ArithmeticException {
		
		if(balance>0)
			balance = balance-2000;
		else 
			throw new ArithmeticException("less balance");
		return balance;
	}
	@Override
	public boolean validateCard(int cardNo) {

		System.out.println("card validation completed");
		return true;
	}

}
