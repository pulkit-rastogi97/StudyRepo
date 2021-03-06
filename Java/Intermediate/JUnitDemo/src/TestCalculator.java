import static org.junit.Assert.*;

import org.junit.*;
public class TestCalculator {

	static Calculator ref;
	
	@BeforeClass
	 static public void init()
	{
		System.out.println("call to @Bfore ");
		ref = new Calculator();
	}
	
	@AfterClass
	static public void destroy()
	{
		System.out.println("call to @After");
		ref = null;
	}
	@Test
	public void testAdd()
	{
		System.out.println("testAdd");
		int result = ref.add(12,9);
		assertSame(21,result);
	}
	@Test
	public void testSubtract()
	{
		System.out.println("testSubtract");
		int res = ref.subtract(23, 56);
		assertNotSame(0,res);
	}
	@Test
	public void testMultiply()
	{
		System.out.println("testMultiply");
		int res = ref.multiply(5, 6);
		assertNotSame(0,res);
	}
	@Test(expected=ArithmeticException.class)
	public void testDivide()
	{
		System.out.println("testDivide");
		int res = ref.divide(5, 0);
		assertNotSame(0,res);
	}
}
