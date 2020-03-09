
public class Demo implements DemoI{

	public void method1()
	{
		System.out.println("method 1");
	}
//	public void method2()
//	{
//		System.out.println("method 2");
//	}
	public void fromInterface()
	{
		this.method2();
		DemoI.method3();
	}
}
