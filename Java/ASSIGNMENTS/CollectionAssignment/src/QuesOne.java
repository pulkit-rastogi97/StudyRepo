import java.util.ArrayList;
import java.util.Scanner;

public class QuesOne {

	public static void main(String[] args) {

		ArrayList<String> sname = new ArrayList<>();
		sname.add("Pulkit");
		sname.add("Vijay");
		sname.add("Apurva");
		sname.add("Vaishali");
		sname.add("Prateek");
		sname.add("Ashutosh");
		sname.add("shivam");
		sname.add("Alok");
		sname.add("Mridul");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name you want to search : ");
		String name = sc.next();
		boolean flag = false;
		for (String s : sname) {
			if (s.equalsIgnoreCase(name)) {
				flag = true;
			}
		}
		if (flag)
			System.out.println("Name exists");
		else
			System.out.println("Name doesn't exist");

		sc.close();

	}

}
