package DayOneAssignment;

import java.util.Scanner;


public class QuesThree {

	public static int[] findPrime(int start, int end)
	{
		boolean isPrime=true;
		int k =0;
		int[] arr = new int[end-start];
		for(int i = start; i<=end; i++)
		{
			for(int j = 2; j<i; j++)
			{
				if(j%i==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				arr[k]=i;
				k++;
			}
		}		
		return arr;
	}
	public static void main(String[] args) {
		System.out.println("Enter the starting point : ");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		System.out.println("Enter the ending point : ");
		int end = sc.nextInt();
		
		int[] result=findPrime(start,end);
		System.out.println("The Prime no. in the given range is as follows : ");
		for(int x : result)
			System.out.println(x);
		sc.close();
	}
}
