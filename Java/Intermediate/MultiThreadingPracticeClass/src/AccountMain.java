
public class AccountMain {

	public static void main(String[] args) {
		ThreadAccount obj = new ThreadAccount();
		
		Thread t1 = new Thread(obj,"firstThread");
		Thread t2 = new Thread(obj,"secondThread");
		
		t1.start();
		t2.start();

	}

}
