
public class Circle extends Shape{

	
		static public enum courses {
			JEE,BI,SAP,CPP;}

	private int radius;
	
	public Circle(int radius)
	{
		this.radius=radius;
	}
	@Override
	public double calArea()
	{
		return 3.142*radius*radius;
		
	}
}
