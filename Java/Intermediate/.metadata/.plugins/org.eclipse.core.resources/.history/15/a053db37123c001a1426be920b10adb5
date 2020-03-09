
public class JoinThread implements Runnable{

	public JoinThread() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run()
	{
		System.out.println("current thread = "+Thread.currentThread().getName());
		System.out.println("current thread priority = "+Thread.currentThread().getPriority());
		for(int i = 0; i<30; i++)
		{
			try{
				Thread.currentThread().join(200);
				System.out.println("current thread in for is = ");
				System.out.println(Thread.currentThread().getName());
				
			}catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("i = "+(i+1));
		}
	}

}
