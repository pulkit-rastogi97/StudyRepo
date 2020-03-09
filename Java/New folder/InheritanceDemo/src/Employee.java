
public class Employee {
	private int empId;
	private String empName;
	private int empSal;
	private double calSal;
	Departments department;
	
	public Employee()
	{
		
	}
	public Employee(int empId, String empName, int empSal, Departments department)
	{
		this.empId=empId;
		this.empName = empName;
		this.empSal = empSal;
		this.department=department;
	}
	public void Display()
	{
		System.out.println("empId = "+empId+" empName = "+empName+" empSal = "+empSal);
	}
	public double calSal()
	{
		return 0.0;
	}
}
