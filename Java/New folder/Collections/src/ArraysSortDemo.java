import java.util.Arrays;


public class ArraysSortDemo {

	public static void main(String[] args) {
		String[] str = {"Pune", "Goa","Nagpur","Hyderabad"};
		
		Arrays.sort(str);
		
		System.out.println("after sorting : ");
		for(String s : str)
			System.out.println(s);
		
		//Another Way
		System.out.println(Arrays.toString(str));
		
		
		Student[] stuarr = new Student[3];
		stuarr[0]=new Student(12,"Pune");
		stuarr[1]=new Student(110,"Uune");
		stuarr[2]=new Student(07,"Pane");
		
		//Arrays.sort(stuarr, new SortObject());
		for(Student stu : stuarr)
			System.out.println(stu);
	}
}
