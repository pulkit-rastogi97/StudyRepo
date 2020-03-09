package Exception;

public class DivisionDemo {
	
	public static int division(int num, int data)
	{
		return num/data;
	}
	
	
	public static void main(String[] args) {
	
		int num=9,data=0,res=0;
		String str;
		str = null;
		System.out.println("division starts ");
		try{
			int n = str.length();
			res=division(num,data);
			System.out.println("String length : "+n);
		}
		
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("finally");
		}
		
		System.out.println("Division Complete");
		System.out.println("res = "+res);
		
		
		
	}

}
