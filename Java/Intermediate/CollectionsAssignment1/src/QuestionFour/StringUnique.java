package QuestionFour;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringUnique {

	static Map<String,Integer> words = new HashMap<String,Integer>();
	
	public static int returnUniquesymbols(String kar)
	{
		String str = kar.toLowerCase();
		Set<Character> set = new HashSet<>();
		int count=0;
		for(int i = 0; i<str.length(); i++)
		{
			if(set.add(str.charAt(i)))
			{
				count++;
			}
		}
		words.put(str,count);
		return count;		
	}
	
	public static boolean exists(String str)
	{
		String temp = str.toLowerCase();
		for(Map.Entry<String,Integer> map : words.entrySet())
		{
			if(map.getKey().equals(temp))
			{
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		do{
		System.out.println("Choose :: ");
		System.out.println("1. Get Unique character count ");
		System.out.println("2. exit");
	ch  = sc.nextInt();
		sc.nextLine();
		boolean check = false;
		
		switch(ch)
		{
		case 1: System.out.println("Enter a string :: ");
				String str = sc.nextLine();
				check=StringUnique.exists(str);
				if(check)
					System.out.println("Unique characters in the given string is " +words.get(str.toLowerCase()));
				else
					System.out.println("Unique characters in the given string is " +StringUnique.returnUniquesymbols(str));
				break;
		case 2: ch = 3;
				break;
		default:System.out.println("Invalid Choice ");
				
		}}while(ch>0 && ch<=2);
		sc.close();	
	}
}
