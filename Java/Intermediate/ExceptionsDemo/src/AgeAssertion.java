import java.util.Scanner;

public class AgeAssertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age :: ");
		int age = sc.nextInt();
		
		assert age>=18 : "age is not in range";
		System.out.println("age = "+age);
		
		sc.close();
	}
}
