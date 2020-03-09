package dateTimeAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class QuesThree {

	public static void main(String[] args) {
		
		System.out.println("Enter a date :: (dd/MM/yyyy)");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate check=null,date = LocalDate.now();
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
		{
			String inputDate = reader.readLine();
			check = LocalDate.parse(inputDate,formatter);
			if(date.isAfter(check))
				System.out.println("Entered date is valid");
			else
				System.out.println("Entered date is invalid");
		}catch(IOException | NullPointerException | DateTimeException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
