
public class Training {

	String name;
	courses course;
	
	public Training(String name, courses course)
	{
		this.name=name;
		this.course=course;
	}
	@Override
	public String toString()
	{
		return "name = "+name+" course = "+course;
	}
	public courses getCourse()
	{
	return this.course;	
	}
}
