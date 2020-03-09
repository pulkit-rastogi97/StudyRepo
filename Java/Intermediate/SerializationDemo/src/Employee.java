import java.io.Serializable;

public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empId;
	private String empName;
	private int empSal;
	private Address address; //address will not be serialized
	static int cnt = 0;
	
	public Employee()
	{
		
	}
	
	public Employee(int empId, String empName, int empSal, Address address) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.address= address;
		cnt++;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSal=" + empSal + ", address=" + address +" count =  "+cnt+" ]";
	}
	
}
