import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuesSix {

	public static void main(String[] args) {
		
		String s=null,f=null,res;
		
		try(BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)))
		{
			System.out.println("Enter the first String :: ");
			f = reader.readLine();
			System.out.println("Enter the second String :: ");
			s = reader.readLine();
			
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		if(f.length()!=s.length())
		{
			System.out.println("Not rotation of each other !! ");
		}
		else if(f.equals(s))
		{
			System.out.println("Yes !! Both are rotation of each other ");
		}
		else 
		{
			int ptr=0;
			for(int i = 0; i<f.length(); i++)
			{
				if(f.charAt(0)==s.charAt(i))
				{
					ptr=i;
					break;
				}
			}
			res = s.substring(ptr, f.length())+s.substring(0,ptr);
			
			if(f.equals(res))
				System.out.println("Yes !! Both are rotation of each other ");
			else
				System.out.println("Not rotation of each other !! ");		
		}
	}
}
