package myPack;

public class DemoClass   //for accessible outside the package

{
	public void method1()
	{
		System.out.println("method1");
	}
	void method2()
	{
		System.out.println("method2");
	}
	protected void method3()
	{
		System.out.println("protected method3");
	}
	private void method4()
	{
		System.out.println("private method4");
	}
	public static void main(String[] args)
	{
		DemoClass obj = new DemoClass();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
	}
}