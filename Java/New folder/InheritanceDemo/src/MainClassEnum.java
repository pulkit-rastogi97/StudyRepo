
public class MainClassEnum {

	public static void main(String[] args) {

		courses course = courses.BI;
		
		Training obj1 = new Training("Hema",course);
		System.out.println("obj1 = "+obj1);
		System.out.println("obj size = "+obj1.getCourse().getSize());

		
		Training obj2 = new Training("Vaishali",courses.CPP);
		System.out.println("obj2 = "+obj2);
		System.out.println("obj size = "+obj2.getCourse().getSize());
	}
}
