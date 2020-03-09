import myPack.DemoClass;   //otherwise error not accessible
{
	public static void main(String[] args)
		{
			DemoClass obj = new DemoClass();
			obj.method1();
			obj.method2();
			obj.method3();
			//obj.method4();   // error: method4() has private access in DemoClass
		}
}