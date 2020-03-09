
public class Student {
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

			//data members or instance variables
			private int rollNo;
			private String name;
			private int marks;
			static int count=0;
			public static int getCount()
			{
				return count;
			//	System.out.println("Name : "+name);
			}
			public Student(int rollNo, int marks, String name)
			{
				this();
				this.rollNo = rollNo;
				this.name = name;
				this.marks=marks;
				count++;
			}
			public Student()
			{
				rollNo = 0;
				name = null;
				marks = 0;
				count++;
			}
			//member functions
			public void displayData()
			{
				System.out.println("roll no = "+rollNo);
				System.out.println("name = "+name);
				System.out.println("marks = "+marks);
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
