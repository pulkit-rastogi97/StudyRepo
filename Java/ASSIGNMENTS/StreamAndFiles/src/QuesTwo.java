import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuesTwo {

	private final static String FILE_NAME = "io.txt";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :: ");
		String s = sc.nextLine();

		try {
			File file = new File(FILE_NAME);
			if(!file.exists())
			{
				file.createNewFile();
				System.out.println("File created successfully -->"+FILE_NAME);
			}
			FileWriter writer = new FileWriter(file);
			BufferedWriter bwriter = new BufferedWriter(writer);
			bwriter.write(s);
			System.out.println("String successfully written on file");
			
			bwriter.flush();
			writer.flush();
			bwriter.close();
			writer.close();

			System.out.println("Size of file :: " + file.length() + " bytes");
			System.out.println("Size of file in kilobytes :: " + (file.length() / 1024) + " kb ");
			System.out.println("Size of file in megabytes :: " + (file.length() / (1024 * 1024)) + " mb");
			
			FileReader reader = new FileReader(file);
			BufferedReader breader = new BufferedReader(reader);
			int ch = 0;
			while((ch=breader.read())!=-1)
			{
				System.out.print((char)ch);
			}
			breader.close();
			reader.close();
			
			System.out.println("\nFile Successfully Read !!");
			
			file.delete();
			if(!file.exists())
			{
				System.out.println("File Successfully Deleted !! ");
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}
