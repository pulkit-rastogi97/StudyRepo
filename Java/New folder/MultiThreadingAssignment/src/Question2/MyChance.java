package Question2;

public class MyChance implements Runnable{
	
	@Override
	public void run()
	{
		System.out.println("Current thread = "+Thread.currentThread().getName());
		for(int i = 0; i< 100 ; i++){
		if(Thread.currentThread().getPriority()==Thread.MAX_PRIORITY)
		{
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Running thread :: "+Thread.currentThread().getName());
		}
		
	}

}
