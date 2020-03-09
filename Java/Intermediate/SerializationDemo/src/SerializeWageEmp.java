import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class SerializeWageEmp {

	public static void main(String[] args) {
		File f = new File("serlwageemp.txt");
		try
		{
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Address address = new Address("411043","Pune");
			WageEmp wemp = new WageEmp(122,"Priya",30000,address,30,300);
			oos.writeObject(wemp);
			oos.flush();
			oos.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
