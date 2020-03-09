
public class WageEmp extends Employee{
	
	private int hour,rate;
	
	public WageEmp(int empId, String empName,int empSal, int hour, int rate)
	{
		//super(empId, empName, empSal);
		this.hour=hour;
		this.rate=rate;
		
	}
	@Override
	public void Display()
	{
		super.Display();
		System.out.print("hour = "+hour+" rate = "+rate);
	}
	@Override
	public double calSal()
	{
		return hour*rate;
	}
}
