package simpleJava;

import java.util.ArrayList;
import java.util.List;

class Student{
	
	String name;
	String id ;
	public Student(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

}
public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("osdfgh","11");
		Student s2 = new Student("qwte", "22");
		
		List<Student> res = new ArrayList<Student>();
		
		Student s3 =s2;
//		System.out.println(s3.hashCode());
//	System.out.println(s2.hashCode());
//		System.out.println(s3);
		res.add(s2);
		System.out.println(res.size());
		res.add(s1);
		s2=null;
		System.out.println(res);
		System.out.println(res.remove(s3));
		
		System.out.println(res);
	}
}
