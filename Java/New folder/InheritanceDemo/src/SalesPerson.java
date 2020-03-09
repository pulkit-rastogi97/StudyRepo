
public class SalesPerson extends WageEmp{
	
	int comm;
	int sales;
	public SalesPerson(int empId, String empName,int empSal, int hour, int rate, int comm, int sales)
	{
		super(empId, empName, empSal,hour,rate);
		this.sales=sales;
		this.comm=comm;
		
	}
	@Override
	public void Display()
	{
		super.Display();
		System.out.print("comm = "+comm+" sales = "+sales);
	}
	@Override
	public double calSal(){
	return super.calSal()+(sales*comm);
	}
	

}
