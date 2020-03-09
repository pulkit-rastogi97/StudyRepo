import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeserializeStudent {
	public static void main(String[] args) {
		File f = new File("serlstu.txt");
		try
		{
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s = (Student)ois.readObject();
			ois.close();
			System.out.println(s);
		}catch(IOException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
