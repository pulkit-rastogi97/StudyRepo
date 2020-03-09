package Question3;

public class MainClass {
	
	public static void main(String[] args) {
		
		Storage s = new Storage();
		
		Counter c = new Counter(s);
		Printer p = new Printer(s);
		
		Thread t1 = new Thread(c,"counter thread");
		Thread t2 = new Thread(p,"printer thread");
	
		t1.start();
		t2.start();
	}

}
