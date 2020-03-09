package Question1;

public class MyThreadMain {

	public static void main(String[] args) {
		MyThread obj = new MyThread();
		Thread t1 = new Thread(obj,"firstThread");
		Thread t2 = new Thread(obj,"secondThread");
		Thread t3 = new Thread(obj,"thirdThread");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(3);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		t2.start();
		t3.start();
		t1.start();
	
	}
}
