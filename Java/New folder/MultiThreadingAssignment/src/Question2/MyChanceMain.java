package Question2;

public class MyChanceMain {

	public static void main(String[] args) {
		
		MyChance obj = new MyChance();
		Thread t1 = new Thread(obj,"Max_Priority");
		Thread t2 = new Thread(obj,"Low_Priority");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
	}
}
