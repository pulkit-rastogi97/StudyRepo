public class Student {

	private int rollNo;
	private String name;

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

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

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj)
	{
		System.out.println("call to equals");
		boolean flag = false;
		if(obj instanceof Student)
		{
			Student ref = (Student)obj;
			if(ref.getName().equals(this.getName()) && ref.getRollNo()==this.getRollNo())
			{
				flag=true;
			}
		}
		return flag;
		
	}
	
	@Override
	public int hashCode()
	{
		System.out.println("call to hashcode");
		return this.name.length();
	}
	
	
}
