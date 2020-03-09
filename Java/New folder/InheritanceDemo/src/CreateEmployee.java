
public class CreateEmployee {
	public static void main(String[] args) {
		Employee emp = new WageEmp(1,"Neha",40000,20,25); 
				//Employee(1,"Neha",40000);
		emp.Display();
		
		WageEmp wEmp = new WageEmp(2,"Ganesh",50000,30,30);
		wEmp.Display();
		
		WageEmp ref = (WageEmp)emp; //down casting
		
		Employee emp1 = (Employee)wEmp; //up casting
	}

}
