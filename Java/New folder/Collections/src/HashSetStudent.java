import java.util.HashSet;

public class HashSetStudent {
	public static void main(String[] args) {
		HashSet<Student> student = new HashSet<Student>();
		Student stu1 = new Student(12,"Nisha");
		Student stu2 = new Student(02,"priyaaaa");
		Student stu3 = new Student(32,"mala");
		Student stu4 = new Student(52,"rin");
		Student stu5 = new Student(82,"Poojaaw");
		Student stu6 = new Student(32,"mala");
		student.add(stu1);
		student.add(stu2);
		student.add(stu3);
		student.add(stu4);
		student.add(stu5);
		student.add(stu6);
		
		for(Student s : student)
			System.out.println(s);
	}
}
