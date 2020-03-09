
public class WageEmp extends Employee{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int hour,rate;

	public WageEmp(int empId, String empName, int empSal, Address address, int hour, int rate) {
		super(empId,empName,empSal,address);
		this.hour = hour;
		this.rate = rate;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "WageEmp [hour=" + hour + ", rate=" + rate + "]";
	}
	
}
