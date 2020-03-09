package Exception;

import java.io.IOException;

public class Account {

	double balance;
	String name;
	public Account(String name,double balance)
	{
		this.balance=balance;
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	@Override
	public String toString()
	{
		return "name ="+name+" balance = "+balance;
	}
	public double getBalance(String name) throws AccountException
	{
		double bal = 0.0;
		
			if("Pooja".equals(name))
			{
				bal=this.balance;
			}
			else
				throw new AccountException("not a valid user ");
		
		return bal;
	}
	public void withdraw(double amt) throws AccountException
	{
			if(amt>balance)
				throw new AccountException("Insufficient balance");
			else
			     balance = balance - amt;
		
	}
}
