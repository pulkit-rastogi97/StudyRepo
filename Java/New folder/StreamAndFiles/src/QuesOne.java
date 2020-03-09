import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuesOne {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		boolean flag = false;
		String ans;
		if (args.length < 2)
			System.out.println("Enter both source and destination file names ");
		else 
		{
			File toRead = new File(args[0]);
			File toWrite = new File(args[1]);
			try {
				if (!toRead.exists()) 
				{
					System.out.println("Source File doesn't exist");
				} 
				else 
				{				
					FileReader reader = new FileReader(toRead);
					BufferedReader breader = new BufferedReader(reader);
					
					if (!toWrite.exists()) 
					{
						toWrite.createNewFile();
						flag = false;
					} 
					else 
					{
						System.out.println("File exists ! Do you want to overwrite :: (Yes/No) ? ");
						ans = scan.next();
						
						if (ans.equalsIgnoreCase("yes"))
							flag = false;
						else if (ans.equalsIgnoreCase("no"))
							flag = true;
						else 
							System.out.println("Invalid Choice !! ");
						
					}
					
					FileWriter writer = new FileWriter(toWrite,flag);
					BufferedWriter bwriter = new BufferedWriter(writer);
					
					int ch = 0;
					if (flag) 
					{
						while ((ch = breader.read()) != -1) 
						{
							bwriter.write((char) ch);
						}
						bwriter.flush();
						writer.flush();
						bwriter.close();
						writer.close();
						breader.close();
						reader.close();
					} 
					else if (!flag) 
					{
						while ((ch = breader.read()) != -1) 
						{
							bwriter.write((char) ch);
						}
						bwriter.flush();
						writer.flush();
						bwriter.close();
						writer.close();
						breader.close();
						reader.close();
					}
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

		}
		scan.close();
	}
}
