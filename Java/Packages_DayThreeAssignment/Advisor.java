package com.persistent.app;
import java.util.Random;

public class Advisor {

	String[] messages= new String[5];
	public Advisor()
	{
		messages[0]="Honesty is the best policy";
		messages[1]="Work smarter than Harder";
		messages[2]="Hard Work has no other alternative";
		messages[3]="Pune is a good city, don't pollute it.";
		messages[4]="Persistent will offer a great exposure, work hard for it";
	}
	public String getAdvice()
	{
		int temp;
		Random r = new Random();
		temp=r.nextInt(5-1)+1;
		return messages[temp];
	}
}