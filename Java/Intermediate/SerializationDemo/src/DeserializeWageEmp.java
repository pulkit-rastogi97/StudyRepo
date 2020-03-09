import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeserializeWageEmp {

	public static void main(String[] args) {
		WageEmp wemp=null;
		File f = new File("serlwageemp.txt");
		try
		{
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			wemp = (WageEmp)ois.readObject();
			System.out.println(wemp);
			ois.close();
		}catch(IOException | ClassNotFoundException e )
		{
			e.printStackTrace();
		}

	}

}
