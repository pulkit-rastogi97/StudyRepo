import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee[] emp = new Employee[2];
		ArrayList<Employee> empList = new ArrayList<Employee>();
		String empName;
		int empId;
		float empSal;
		System.out.println("Enter the employee details :: ");
		for(int i = 0; i < emp.length; i++)
		{
			System.out.println("Enter the details of employee no. "+(i+1));
			System.out.println("Enter the employee id :: ");
			empId = sc.nextInt();
			System.out.println("Enter the employee name :: ");
			empName = sc.next();
			System.out.println("Enter the employee salary :: ");
			empSal = sc.nextFloat();
			emp[i]=new Employee(empId,empName,empSal);
			empList.add(emp[i]);
		}
		
		boolean result=false;
		try {
			result = JDBCDemo.insertEmployee(empList);
		} catch (ClassNotFoundException | SQLException e) {
			
			System.out.println(e.getMessage());
		}
		if(result)
			System.out.println("Successfully inserted !! ");
		else
			System.out.println("Not Inserted !! ");
		
		sc.close();
		

	}

}
