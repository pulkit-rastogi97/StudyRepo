
public class MainThread {

	public MainThread() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread());
		Thread t2 = new Thread(new MyThread());
		t1.setPriority(8);
		t1.start();
		t2.setPriority(4);
		t2.start();

	}

}
