import java.util.Scanner;

public class QuesFour {

	public static String  makeReverse(String str)
	{
		String[] arr = str.split(" ");
		str="";
		StringBuilder temp;
		for(int i =0; i<arr.length; i++)
		{
			temp=new StringBuilder(arr[i]);
			arr[i]=temp.reverse().toString();
			if(i==arr.length-1)
				str+=arr[i];
			else
				str+=arr[i]+" ";
		}		
		return str;
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string :: ");
		String str = sc.nextLine();
		System.out.println("The reverse of the string is :: "+makeReverse(str));
		
		sc.close();
	}

}
