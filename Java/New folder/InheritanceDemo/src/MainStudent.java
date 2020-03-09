
public class MainStudent {

	public static void main(String[] args) {
		Student stu = new Student(12,"Poorvi");
		System.out.println("stu = "+stu);
		/*
		 * System.out.println("stu = "+stu.toString());
		 */
		Student stu1 = new Student(12,"Poorvi");
		
		if(stu.equals(stu1))
			System.out.println("equals");
		else
			System.out.println("not equals");
	}
}
