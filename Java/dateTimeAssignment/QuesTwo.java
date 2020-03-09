package dateTimeAssignment;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class QuesTwo {
	public static void main(String[] args) {
		
		LocalDate beforeDate = LocalDate.now().minusYears(1);
		System.out.println("Before 1 year day was :: "+beforeDate.getDayOfWeek()+" & Date was :: "+beforeDate);
	
		DayOfWeek day = LocalDate.now().getDayOfWeek();
		System.out.println("Today is :: "+day+" & Today's Date is :: "+LocalDate.now());
		
		LocalDate afterDate = LocalDate.now().plusYears(1);
		System.out.println("After 1 year day will be :: "+afterDate.getDayOfWeek()+" & Date will be :: "+afterDate);
		
		
		
	}

}
