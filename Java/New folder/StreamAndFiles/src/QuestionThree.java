import java.io.File;
import java.util.Scanner;


public class QuestionThree {

	public QuestionThree() {
		// TODO Auto-generated constructor stub
	}
	public boolean searchFile(String path, String filename)
	{
		File f = new File(path);
		if(!f.exists())
		{
			System.out.println("Path doesn't exist ");
			return false;
		}
		if(f.isFile())
		{
				System.out.println("Path itself is file");
				return true;
		}
		if(f.isDirectory())
		{
		
			String[] files = f.list();
			for(String s : files)
			{
				if(s.equals(filename))
				{
					System.out.println("File found");
					return true;
				}
			}
		}
		return false;
		
	}
	public static void main(String[] args) 
	{
		QuestionThree qte = new QuestionThree();
		System.out.println("Enter the path name (full specified) :: ");
		@SuppressWarnings("resource")
		String pathName = new Scanner(System.in).nextLine();
		System.out.println("Enter the file name you want to search :: ");
		@SuppressWarnings("resource")
		String fileName = new Scanner(System.in).nextLine();
		if(!qte.searchFile(pathName, fileName))
		{
			System.out.println("File Not Found");
		}
		
		
	}

}
