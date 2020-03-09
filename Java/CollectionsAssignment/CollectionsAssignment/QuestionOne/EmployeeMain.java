package QuestionOne;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle(92,Vehicle_Type.TWO_WHEELER);
		Vehicle v2 = new Vehicle(93,Vehicle_Type.FOUR_WHEELER);
		
		Employee emp1 = new Employee(12, "pulkit ", 100000, v1);
		
		System.out.println(v1);
		System.out.println(emp1);
		
		Employee emp2 = new Employee(12,"Neha",123412,v2);
		System.out.println(emp2);
	}

}
