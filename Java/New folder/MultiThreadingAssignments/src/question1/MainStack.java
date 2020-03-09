package question1;

public class MainStack {
	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		Thread t1 = new Thread(s,"Push");
		Thread t2 = new Thread(s,"Pop");
		
		t1.start();
		t2.start();
	}

}
