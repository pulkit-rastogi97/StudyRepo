
public class Triangle extends Shape{

	private int length, height;
	
	public Triangle(int length, int height)
	{
		this.height=height;
		this.length= length;
	}
	@Override
	public double calArea(){
		return 0.5*length*height;
	}
}
