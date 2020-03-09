package Question2;
import java.util.Random;


public class RandomNumbers implements Runnable {
	
	Store st;
	public RandomNumbers(Store st){
		this.st = st;
	}
	@Override
	public void run() {
		Random r = new Random();
		for(int i =0 ;i<3;i++){
		synchronized(st){
			int rand = r.nextInt(100)-50;
			st.setI(rand);
			st.notify();
			try {
				st.wait(10);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		}
		
	}
	

}
