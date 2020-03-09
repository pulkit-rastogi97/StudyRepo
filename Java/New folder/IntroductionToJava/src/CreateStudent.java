
public class CreateStudent {

	public static void main(String[] args) {
		Student ref = new Student(111,90,"abha");
		
		ref.setRollNo(111);
		ref.setName("abha");
		ref.setMarks(90);
		
		ref.displayData();
		Student s = new Student();
		Student n = new Student();
		System.out.println(Student.getCount());
	

	}

}
