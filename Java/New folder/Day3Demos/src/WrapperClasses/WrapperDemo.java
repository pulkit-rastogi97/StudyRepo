package WrapperClasses;

public class WrapperDemo {

	public static void main(String[] args) {
		int var = 112;
		Integer obj = new Integer (var);   //Boxing
		System.out.println(var+" "+obj);
		
		Integer onj1= var;  //AutoBoxing
		/* object to primitive*/
		
		int y = obj.intValue(); //unboxing
		int x = obj;
		System.out.println("x = "+x+" y = "+y);
		
		Integer ref1 = new Integer("123");
		
		Double d = new Double(10.0);
		
		double n = d.doubleValue();
		double pl = d;
		System.out.println("n = "+ n + " p = "+ pl);
		
		
	}

}
