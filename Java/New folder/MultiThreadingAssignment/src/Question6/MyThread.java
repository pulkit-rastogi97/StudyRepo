package Question6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class MyThread implements Runnable{

	String name;
	public MyThread(String name)
	{
		this.name = name;
	}
	@Override
	public void run() 
	{
		System.out.println("Current Thread = "+Thread.currentThread().getName());
		try (Scanner scanner = new Scanner( new File(name), "UTF-8" )) {
		    scanner.useDelimiter("\n");
		    while(scanner.hasNext())
		    {
		    	System.out.println(scanner.next()+" "+name);
		    	Random random = new Random();
		    	Thread.sleep((long)random.nextInt((3000-1000)+1)+1000);
		    }	    
		} catch (FileNotFoundException | InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	

}
