import java.util.Scanner;


public class QuesFour {
	static int index=0;
	static String[] combinations(String input, String res, String[] arr)
	{
		
		if(input.length()==0)
		{
			arr[index]=res;
			index++;
		}
		
		for (int i = 0; i < input.length(); i++) { 

			char c = input.charAt(i); 

			String rem = input.substring(0, i) + 
						input.substring(i + 1); 

			combinations(rem, res + c,arr); 
		} 		
		return arr;		
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String input = scan.next();
		if(input.length()==0)
			System.out.println(" Kindly, enter a valid string ");
		else
		{
		int size = input.length();
		for(int i=input.length();i>1; i--)
		{
			size*=(i-1);
		}
		String[] arr = new String[size];
		
		System.out.println("The permutation and combinations of the string are as follows : ");
		
		combinations(input,"",arr);
		for( String s : arr)
			System.out.println(s+" ");
		}
			scan.close();
	}
}
