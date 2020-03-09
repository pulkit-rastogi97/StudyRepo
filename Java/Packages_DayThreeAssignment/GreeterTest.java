package com.persistent.pI;

import com.persistent.app.Advisor;
import com.persistent.app.Greeter;

public class GreeterTest {

	public static void main(String[] args) {
		if(args.length==0)
			System.out.println("Pass Command Line Arguments ");
		else
		{
			Greeter[] greet = new Greeter[args.length];
			for(int i = 0; i<args.length; i++)
			{
				greet[i]=new Greeter(args[i]);
				System.out.println(greet[i].sayHello());
			}
			Advisor ad = new Advisor();
			System.out.println(ad.getAdvice());
			for(int i = 0; i<args.length; i++)
			{
				System.out.println(greet[i].sayGoodBye());
			}
			
		}
	}
}