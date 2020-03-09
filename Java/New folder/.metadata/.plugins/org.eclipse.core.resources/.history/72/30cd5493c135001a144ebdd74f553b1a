package stringQues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuesFour {

	public static void main(String[] args) {

		// Using logic
		String str = null;
		System.out.println("Enter a string : ");
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in))) {
			str = reader.readLine();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		if (str.length() == 0)
			System.out.println("String is empty ");
		else {
			int[] ch = new int[256];
			for (int i = 0; i < str.length(); i++) {
				ch[(int) str.charAt(i)]++;
			}
			System.out
					.println("The dulicate characters present in the string are : ");
			for (int i = 0; i < ch.length; i++)
				if (ch[i] > 1)
					System.out.print((char) i + " ");
			/*
			 * // Using Set property to keep only unique entities //
			 * Set<Character> duplicate = new HashSet<Character>();
			 * System.out.println("Enter a String :: "); String str = null;
			 * 
			 * try(BufferedReader reader = new BufferedReader(new
			 * InputStreamReader(System.in))) { str = reader.readLine();
			 * }catch(IOException e) { System.out.println(e.getMessage()); }
			 * 
			 * System.out.println(
			 * "Duplicate characters in the string are as follows :: ");
			 * System.out.print("[ "); for(int i = 0; i<str.length(); i++) {
			 * if(!duplicate.add(str.charAt(i))) { if(i<str.length()-1)
			 * System.out.print(str.charAt(i)+" , "); else
			 * System.out.print(str.charAt(i)+" "); } } System.out.print("]");
			 */

		}

	}
}
