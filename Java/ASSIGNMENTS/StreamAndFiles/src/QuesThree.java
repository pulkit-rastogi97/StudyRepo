import java.util.Scanner;

public class QuesThree {

	public static int check(String sentence,String word){
		int count = 0;
		
		String[] arr = sentence.split(" ");
		for(String s : arr)
		{
			if(s.equals(word))
			{
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence :: ");
		String sentence  =  sc.nextLine();
		System.out.println("Enter a word :: ");
		String word = sc.next();
		int ans = check(sentence,word);
		if(ans==0)
		{
			System.out.println("Word doesn't exists ");
		}
		else
		{
			System.out.println("The given word occurs "+ans+" times in the sentence.");
		}
		sc.close();
	}

}
