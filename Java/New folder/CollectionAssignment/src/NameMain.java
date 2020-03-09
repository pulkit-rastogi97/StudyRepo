import java.util.Scanner;
import java.util.Vector;

public class NameMain {

	static Scanner sc = new Scanner(System.in);
	static Vector<Name> v = new Vector<Name>();
	static String firstName,lastName;
	
	public static Name insertIntoObject(String firstName,  String lastName)
	{
		return (new Name(firstName,lastName));
	}
	
	public static void insert()
	{
		System.out.println("Enter the first name :: ");
		firstName = sc.next();
		System.out.println("Enter the last name :: ");
		lastName = sc.next();
		v.add(insertIntoObject(firstName,lastName));		
	}
	
	public static void display()
	{
		for(Name name : v)
		{
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		
		boolean ch = true;
		do{
			System.out.println("***************************");
			System.out.println("Choose the option Below : ");
			System.out.println("1. Enter the details ");
			System.out.println("2. Display details ");
			System.out.println("3. Exit ");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1: insert();
						break;
				case 2: display();
						break;
				case 3: ch = false;
						break;
				default : System.out.println("Invalid Choice ");
			}
		}while(ch);

	}

}
