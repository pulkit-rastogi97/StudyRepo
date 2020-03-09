package Question2;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store s = new Store();
		RandomNumbers random = new RandomNumbers(s);
		Determine determine = new Determine(s);
		
		Thread t1 = new Thread(random);
		Thread t2 = new Thread(determine);
		
		t1.start();
		t2.start();
	}

}
