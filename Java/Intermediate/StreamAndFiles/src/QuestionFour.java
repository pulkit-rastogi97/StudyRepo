import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class QuestionFour {

	public static int countWords(String filePath)
	{
		int count=0;
		File f = new File(filePath);
		try(Scanner sc = new Scanner(new FileInputStream(f))){
		    
		    while(sc.hasNext()){
		        sc.next();
		        count++;
		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return count;
		
	}

	public static void main(String[] args){
		System.out.println("Enter the path of the file :: ");
		@SuppressWarnings("resource")
		String filePath = new Scanner(System.in).next();
		System.out.println("Number of words: " + QuestionFour.countWords(filePath));
		}

		
	}
