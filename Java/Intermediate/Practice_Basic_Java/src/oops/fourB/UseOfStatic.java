package oops.fourB;

public class UseOfStatic {

	static int a;
	int b;
	
	static UseOfStatic c,d;
	static void getMethod()
	{
		a=10;
		d.b=10;
		c=new UseOfStatic();
		c.b=5;
	}
}
