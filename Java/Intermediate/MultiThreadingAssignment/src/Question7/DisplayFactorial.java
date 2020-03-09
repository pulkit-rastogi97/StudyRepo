package Question7;

public class DisplayFactorial {

	public static void main(String[] args) {
		
	PrintFactorial pf = new PrintFactorial();
	Thread t1 = new Thread(pf,"Fetch");
	Thread t2 = new Thread(pf,"Display");
	
	t1.start();
	t2.start();
	}
}
