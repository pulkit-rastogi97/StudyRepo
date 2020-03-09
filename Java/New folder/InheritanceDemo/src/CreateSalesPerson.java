public class CreateSalesPerson {
	public static void main(String[] args) {
		WageEmp wEmp1 = new WageEmp(2,"Ganesh",50000,30,30);
		wEmp1.Display();
		
		SalesPerson sp = new SalesPerson(3,"Mohit",60000,31,31,10000,5000);
		sp.Display();
		
		//UpCasting
		WageEmp wEmp2 = (WageEmp) sp;
		
		//DownCasting
		//SalesPerson nc = (SalesPerson) wEmp1; // will show an error
		
		
		Employee emp = null;
		
		//Compile Time Binding or static polymorphism
		//emp = new Employee(12,"Nisha",20000);
		System.out.println("sal = "+emp.calSal());
		emp.Display();
		
		//Run Time Binding or Dynamic polymorphism
		emp = new WageEmp(13,"Pooja",30000,20,200);
		System.out.println("sal = "+emp.calSal());
		emp.Display();
		
		
		emp=new SalesPerson(14,"Vikram",40000,50,300,30,500);
		System.out.println("sal = "+emp.calSal());
		emp.Display();
		
	}
}