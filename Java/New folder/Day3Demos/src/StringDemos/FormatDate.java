package StringDemos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TimeZone;

public class FormatDate {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter date :: dd/MM/yyyy");
		String input = sc.next();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate date = LocalDate.parse(input,format);
		if(date!=null)
			System.out.println("date is valid = "+date);
		else
			System.out.println("iNvalid Input");
		
		
		String[] zone = TimeZone.getAvailableIDs();
		for(String s : zone)
			System.out.println(s);
	
	
	}

}
