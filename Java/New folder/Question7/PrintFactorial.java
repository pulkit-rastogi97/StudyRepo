package Question7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintFactorial implements Runnable {

	boolean printed = true;
	int number,fact;
	
	@Override
	public synchronized void run() 
	{
		
		if(Thread.currentThread().getName().equals("Fetch"))
		{
			try(Scanner scan = new Scanner(new File("Number.txt")))
			{
				while(scan.hasNext())
				{
					
					while(!this.isPrinted()) {              //loop to take care of spontaneous wake-ups
                        try {
                           this.wait();
                        } catch(InterruptedException e) {  }
                     }
					this.number = Integer.parseInt(scan.next());
                    this.setPrinted(false);
                    this.notify();
				}
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
		}
		else
		{
			for(int i = 0 ; i<5; i++) {
			while(this.isPrinted()) {              //loop to take care of spontaneous wake-ups
                try {
                      this.wait();
                } catch(Exception e) {  }
          }
          System.out.println("Factorial of "+this.number+" is "+calculateFactorial(this.number));
          this.setPrinted(true);
          this.notify();
			}
		}
		}
		
	
public int calculateFactorial(int number)
{
		if(number > 1)
        {
            return(number * calculateFactorial(number - 1));
        }
        return 1;
		
}
public boolean isPrinted() {
        return printed;
  }
  public void setPrinted(boolean p) {
        printed = p;
  }

}
