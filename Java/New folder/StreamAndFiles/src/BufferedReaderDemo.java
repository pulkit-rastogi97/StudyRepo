import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferedReaderDemo {

	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
		{
			System.out.println("Enter Adress : ");
			String address = reader.readLine();
			System.out.println("Address  = "+address);
			
			System.out.println("Employee ID : ");
			int empId = Integer.parseInt(reader.readLine());
			System.out.println("empId : "+empId);
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
