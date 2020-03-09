package Question6;

public class Question6 {
	public static void main(String[] args) {
		if(args.length!=2)
		{
			System.out.println("File names must be two ");
			return;
		}
		MyThread obj1 = new MyThread(args[0]);
		MyThread obj2 = new MyThread(args[1]);
		
		Thread t1 = new Thread(obj1,"firstThread");
		Thread t2 = new Thread(obj2,"secondThread");
		
		t1.start();
		t2.start();
		
		
	}

}
