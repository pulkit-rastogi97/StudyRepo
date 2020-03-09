package Question1;

public class MyThread implements Runnable{
	
	@Override
	public void run()
	{
		System.out.println("Current thread = "+Thread.currentThread().getName());
		for(int i = 0; i<10; i++)
		System.out.println("Thread priority = "+Thread.currentThread().getPriority());
		
	}


}
