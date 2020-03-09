package DayOneAssignment;

import java.util.Scanner;


public class QuesFive {

	public static void main(String[] args) 
	{
		System.out.println("Enter the no. of rows : ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		char game[][]=new char[r][r];
		char ch;
		System.out.println("Enter the elements row wise : ");
		for(int i =0; i<r; i++)
		{
			for(int j =0; j<r; j++)
			{
				ch = sc.next().charAt(0);
				if(ch == 'X' || ch == 'O')
				{
					game[i][j]=ch;
				}
				else
				{
					System.out.println("Invalid Character");
					System.out.println("Characters allowed are : 'X' or 'O' ");
					break;
				}
				
			}
		}
		for(int i =0; i<r; i++)
		{
			for(int j =0; j<r; j++)
			{
				if(game[i][j]==game[i][j+1])
				{
					if(j==r-1)
					{
						System.out.println(game[i][j]+" : Wins");
						break;
					}
					continue;
				}
				else
				{
					break;
				}
			}
		}
//		for(int j =0; j<r; j++)
//		{
//			for(int i =0; j<r; i++)
//			{
//				if(game[i][j]==game[i][j+1])
//				{
//					if(j==r-1)
//					{
//						System.out.println(game[i][j]+" : Wins");
//						break;
//					}
//					continue;
//				}
//				else
//				{
//					break;
//				}
//			}
//		}
		for(int i=0; i<r; i++)
		{
			if(game[i][i]==game[i][i+1])
			{
				if(i==r-1)
				{
					System.out.println(game[i][i]+" : Wins");
					break;
				}
				continue;
			}
			else
			{
				break;
			}
		}
		for(int i=r; i>0; i--)
		{
			if(game[i][i]==game[i][i-1])
			{
				if(i==1)
				{
					System.out.println(game[i][i]+" : Wins");
					break;
				}
				continue;
			}
			else
			{
				break;
			}
		}
		
		sc.close();
		
	}
}
