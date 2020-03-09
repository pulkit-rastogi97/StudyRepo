import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;


public class SuperDemo {

	public void method1() throws FileNotFoundException,EOFException
	{
		
	}
	public void method2() throws IOException
	{
		
	}
}

class SubDemo extends SuperDemo
{
	@Override
	public void method1() 
	{
		
	}
	
	@Override
	public void method2() throws RuntimeException,IOException
	{
		
	}
}