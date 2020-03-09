import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeEmployee {

	public static void main(String[] args) {
		File f = new File("serl13.txt");
		try {
			FileOutputStream fout = new FileOutputStream(f);
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			Address address = new Address("411044","Pune");
			Employee emp = new Employee(110, "Nisha", 50000,address);
			oout.writeObject(emp); // serialize object
			oout.flush();
			oout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
