
public class RunnableMain {
	
	public static void main(String[] args) {
		
		Runnable ref = new Runnable(){
			
			@Override
			public void run() {
				for(int i = 0 ; i < 10 ; i++)
				{
					System.out.println("Thread name = "+Thread.currentThread().getName()+" is "+(i+1));
				}
				
			}
			
		};
		Thread t1 = new Thread(ref);
		Thread t2 = new Thread(ref);
		t1.start();
		t2.start();
	}

}
