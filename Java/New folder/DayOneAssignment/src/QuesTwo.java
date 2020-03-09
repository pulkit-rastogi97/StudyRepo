import java.util.Scanner;

public class QuesTwo {

	private static int findPosition(int num,int[] nos)
	{
		int pos=-1;
		for(int i=0; i<nos.length; i++)
		{
			if(nos[i]==num)
				pos=(i+1);
		}
		return pos;
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i =0; i<n; i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the number to be found: ");
		int num=scan.nextInt();
		System.out.println("Position at which number is found : "+findPosition(num,arr));
		scan.close();
	}

}
