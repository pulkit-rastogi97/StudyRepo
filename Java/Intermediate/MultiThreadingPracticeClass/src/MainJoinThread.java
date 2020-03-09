
public class MainJoinThread {

	public MainJoinThread() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		JoinThread obj = new JoinThread();
		Thread t1 = new Thread(obj,"firstThread");
		Thread t2 = new Thread(obj,"secondThread");
		
		t1.start();
		t2.start();

	}

}
