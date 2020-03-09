import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializeStudent {

	public static void main(String[] args) {
		File f = new File("serlstu.txt");
		try
		{
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Student s = new Student("Pulkit",30000,"Hinduism");
			oos.writeObject(s);
			System.out.println("Serilization done");
			oos.flush();
			oos.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
