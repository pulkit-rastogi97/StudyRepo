package dateTimeAssignment;
import java.time.LocalDate;

public class QuesOne {
	
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Today's date is :: "+today);
		System.out.println("Date after a week will be :: "+today.plusWeeks(1));
	}

}
