
public class DemoImpl implements Printable,Scrollable{

	@Override
	public void print(String msg) {
		
		System.out.println("from print");
	}
	
	public static void main(String[] args)
	{
		System.out.println("var = "+Printable.var);
		System.out.println("var = "+Scrollable.var);
		
		Demo obj = new Demo();
		obj.method1();
		obj.method2();
		
		DemoI ref = new Demo();
		ref.method1();
		ref.method2();
		
		obj.fromInterface();
	}

	
}
