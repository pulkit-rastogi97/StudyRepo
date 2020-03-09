package QuestionOne;

public class Employee {

	private int empId;
	private String empName;
	private int empSal;
	private Vehicle vehicle;
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empSal
	 */
	public int getEmpSal() {
		return empSal;
	}
	/**
	 * @param empSal the empSal to set
	 */
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	
	/**
	 * @return the vehicle
	 */
	public Vehicle getVehicle() {
		return vehicle;
	}
	/**
	 * @param vehicle the vehicle to set
	 */
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Employee(int empId, String empName, int empSal, Vehicle vehicle) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.vehicle=vehicle;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", Vehicle = "+vehicle+" ]";
	}
	
	
}
