
import java.io.File;
import java.util.Scanner;


public class QuestionOne {


	public void displayFolderContents(String path)
	{
		File f = new File(path);
		if(!f.exists())
		{
			System.out.println("Path doesn't exist");
			return;
		}
		if(f.isFile())
		{
			System.out.println("Path is a file. Not a directory ");
			return;
		}
		if(f.isDirectory())
		{
			String[] files = f.list();
			for(String s : files)
			{
				System.out.println(s);
			}
			return;
		}	
	}
	
	public static void main(String[] args) {	
		System.out.println("Enter the path :: ");
		@SuppressWarnings("resource")
		String s = new Scanner(System.in).next();
		QuestionOne o = new QuestionOne();
		o.displayFolderContents(s);
	}
}
