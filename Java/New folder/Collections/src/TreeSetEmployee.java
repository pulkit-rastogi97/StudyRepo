import java.util.TreeSet;

public class TreeSetEmployee {
	public static void main(String[] args) {
		TreeSet<Employee> set = new TreeSet<>();
		Employee emp1 = new Employee(119, "Shankar");
		Employee emp2 = new Employee(109, "Varsha");
		Employee emp3 = new Employee(110, "Vaishali");
		Employee emp4 = new Employee(101, "kavita");

		set.add(emp1); // TreeSet invokes compareTo from Employee class.
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);

		for (Employee emp : set) {
			System.out.println(emp);
		}
	}
}
