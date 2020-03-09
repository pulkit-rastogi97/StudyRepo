
public class Student {
	private int rollNo;
	private String name;
	
	Student(int rollNo, String name)
	{
		this.rollNo=rollNo;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", toString()="
				+ super.toString() + "]";
	}
	@Override
	public boolean equals(Object obj)
	{
		boolean flag=false;
		/*
		 * this=stu
		 * obj=stu1
		 */
		if(obj instanceof Student)
		{
			Student s = (Student)obj;
			if(this.rollNo==s.rollNo && this.name.equals(s.name))
			{
				flag=true;
			}
		}
			
		
		return flag;
	}
	
}
