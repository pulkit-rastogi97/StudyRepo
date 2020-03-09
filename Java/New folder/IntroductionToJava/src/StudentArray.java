
public class StudentArray {
	static
	{
		System.out.println("from static block");
	}
	public static void main(String[] args) {
		
		
		Student[] arr =  new Student[3];
		
		arr[0]= new Student(11,90,"a");
		arr[1]= new Student(12,99,"b");
		arr[2]= new Student(13,100,"c");
		
		System.out.println(arr[0].getName());
		System.out.println(arr[1].getName());
		System.out.println(arr[2].getName());
		
	}

}
