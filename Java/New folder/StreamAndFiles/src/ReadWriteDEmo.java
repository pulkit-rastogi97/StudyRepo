import java.io.*;


public class ReadWriteDEmo {

	public static void main(String[] args) {
		File file = new File("data.txt");
		try{
		if(!file.exists())
		{
			boolean flag = file.createNewFile();
			if(flag)
			{
				FileWriter writer = new FileWriter(file);
				writer.write("Welcome to IO");
				writer.flush();
				writer.close();
				
				
				FileReader reader= new FileReader(file);
				int ch=0;
				while((ch=reader.read())!=-1)
				{
					System.out.println((char)ch);
				}
				reader.close();
			}
				
		}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
