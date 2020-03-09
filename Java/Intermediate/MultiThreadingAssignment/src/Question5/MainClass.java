package Question5;

public class MainClass {
	public static void main(String[] args) {
		
		if(args.length!=4)
		{
			System.out.println("Arguments must be four ");
			return;
		}
		Thread1 one = new Thread1(args[0]);
		Thread t1 = new Thread(one);
		Thread1 two = new Thread1(args[1]);
		Thread t2 = new Thread(two);
		Thread1 three = new Thread1(args[2]);
		Thread t3 = new Thread(three);
		Thread1 four = new Thread1(args[3]);
		Thread t4 = new Thread(four);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
