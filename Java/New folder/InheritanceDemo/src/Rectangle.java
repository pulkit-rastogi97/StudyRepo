
public class Rectangle extends Shape{
	private int length,breadth;
	
	public Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	public double calArea()
	{
		return length*breadth;
	}
}
