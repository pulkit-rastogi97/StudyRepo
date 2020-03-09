package stringQues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuesFive {

	public static void main(String[] args) {
		String f,s,t;
		f=s=t=null;
		try(BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)))
		{
			System.out.println("Enter the first String :: ");
			f = reader.readLine();
			
			System.out.println("Enter the second String :: ");
			s = reader.readLine();
			
			System.out.println("Enter the third string :: ");
			t = reader.readLine();
			
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		if((s.length()+f.length()) != (t.length()))
		{

			System.out.println("Third string is not a shuffle of first and second !! ");
		}
		else
		{
			String temp = t;
			int count=0;
			for(int i =0 ; i<f.length(); i++)
			{
				for(int j=0; j<temp.length();j++)
				{
					if(f.charAt(i)==temp.charAt(j))
					{  
						temp=t.substring(j+1, t.length());
						j=-1;
						count++;
						if(count==f.length())
							break;
						else
							i++;
					}
				}
			}
			if(count == f.length())
			{
				count=0;
				temp=t;
				for(int i =0 ; i<s.length(); i++)
				{
					for(int j=0; j<temp.length();j++)
					{
						if(s.charAt(i)==temp.charAt(j))
						{
							temp=t.substring(j+1, t.length());						
							j=-1;
							count++;
							if(count==s.length())
								break;
							else
								i++;
						}
					}
				}
				if(count==s.length())
					System.out.println("Third String is shuffle of first and second ");
				else
					System.out.println("Third String is not shuffle ");
				
			}
			else{
				System.out.println("Third String is not shuffle ");
			}
		}
	}
	
}
