
public class ViewEmployee {

	public static void main(String[] args) {
		Employee emp1 = Employee.createEmployee();
		emp1.setEmpId("A11492");
		emp1.setEmpName("Pulkit");
		emp1.setEmpSal(30000.00f);
		
		System.out.println("******* Employee 1 Details **********");
		System.out.println("Employee Name : "+emp1.getEmpName());
		System.out.println("Employee Id : "+emp1.getEmpId());
		System.out.println("Employee Salary : "+emp1.getEmpSal());
		
		Employee emp2 = Employee.createEmployee("A11500","Rahul",1000.00f);
		System.out.println("******* Employee 2 Details **********");
		System.out.println("Employee Name : "+emp2.getEmpName());
		System.out.println("Employee Id : "+emp2.getEmpId());
		System.out.println("Employee Salary : "+emp2.getEmpSal());
		

	}

}
