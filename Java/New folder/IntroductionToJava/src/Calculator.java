
public class Calculator {

	public static void main(String[] args) {
		String choice="";
		switch(choice)
		{
		case "one" : System.out.println("Addition of 3 and 5 is: "+(3+5));
					break;
		case "two" : System.out.println("Subtraction "+(3-5));
					break;
		case "three" : System.out.println("Multiplication "+(3*5));
						break;
		case "four" : System.out.println("Division "+(3/5));
						break;
		default : System.out.println("Wrong Choice");		
		}
	}

}
