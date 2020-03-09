
public class Employee {
	
	private String empId;
	private String empName;
	private float empSal;
	private static int count = 0;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	private Employee()
	{
		empId="A11000";
		empName= null;
		empSal = 0.00f;
		count++;
	}
	private Employee(String id, String name, float salary)
	{
		empId=id;
		empName= name;
		empSal = salary;
		count++;
	}
	public static Employee createEmployee()
	{
		Employee ref = null;
		if(count==0)
			ref = new Employee();
		return ref;
		
	}
	public static Employee createEmployee(String id, String name, float salary)
	{
		Employee ref = null;
		if(count==0)
			ref = new Employee(id,name,salary);
		return ref;
	}
	
}
