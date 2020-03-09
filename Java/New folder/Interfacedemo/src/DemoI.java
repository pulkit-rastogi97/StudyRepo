
public interface DemoI {

	public void method1();
	default void method2()
	{
		System.out.println("Default method");
	}
	static void method3()
	{
		System.out.println("Static method");
	}
}
