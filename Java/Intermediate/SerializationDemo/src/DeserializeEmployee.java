import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class DeserializeEmployee {

	public static void main(String[] args) {
		
		Employee emp = null;
		File f = new File("serl13.txt");
		try
		{
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			emp = (Employee)ois.readObject();
			System.out.println(emp);
			ois.close();
		}catch(Exception e )
		{
			e.printStackTrace();
		}
	}
}
