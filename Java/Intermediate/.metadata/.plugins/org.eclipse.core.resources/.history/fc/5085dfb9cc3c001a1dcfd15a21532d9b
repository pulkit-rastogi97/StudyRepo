package Question7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintFactorial implements Runnable {

	int number,fact;
	
	@Override
	public synchronized void run() {
		if(Thread.currentThread().getName().equals("Fetch"))
		{
			try(Scanner scan = new Scanner(new File("Number.txt"),"UTF-8"))
			{
				scan.useDelimiter("\n");
				while(scan.hasNext())
				{
					number=Integer.parseInt(scan.next());
				}
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
		}
		else
		{
			
		}
		}
		
	
	public int calculateFactorial(int number)
	{
		if(number==1)
			return number;
		else
			return number*calculateFactorial(--number);
		
	}

}
