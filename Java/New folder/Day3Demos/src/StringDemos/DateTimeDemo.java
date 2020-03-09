package StringDemos;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDate today= LocalDate.now();
		System.out.println("today = "+today);
		
		LocalDate date = LocalDate.of(2020, Month.APRIL, 15);
		System.out.println("Date = "+date);
		
		Period diff = date.until(today);
		System.out.println("difference in year = "+diff.getYears());
		System.out.println("difference in months = "+diff.getMonths());
		System.out.println("difference in days = "+diff.getDays());
		
		LocalDate newDate = LocalDate.now(ZoneId.of("America/New_York"));
		System.out.println("newDate = "+newDate);
		
		LocalDateTime timeAmerica = LocalDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("timeAmerica = "+timeAmerica);
		
		ZonedDateTime zDate = ZonedDateTime.now();
		System.out.println("zDate = "+zDate);
		
	}
}
