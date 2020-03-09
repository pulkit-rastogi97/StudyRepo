import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class BufferReadWrite {


	public static void main(String[] args) {
		File file = new File("databuffer.txt");
		try{
		if(!file.exists())
		{
			boolean flag = file.createNewFile();
			if(flag)
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter bwriter = new BufferedWriter(writer);
				bwriter.write("Welcome to IO");
				bwriter.flush();
				bwriter.close();
				
				
				FileReader reader= new FileReader(file);
				BufferedReader breader = new BufferedReader(reader);
				int ch=0;
				while((ch=breader.read())!=-1)
				{
					System.out.println((char)ch);
				}
				breader.close();
			}
				
		}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
