package esg.itp.shape;

public class Rectangle implements Polygon{

	private float length;
	private float breadth;
	private float area;
	private float peri;
	
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	
	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public float getPeri() {
		return peri;
	}

	public void setPeri(float peri) {
		this.peri = peri;
	}

	public Rectangle(float length, float breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}

	@Override
	public void calArea() {
		this.area=length*breadth;
		
	}

	@Override
	public void calPeri() {
		this.peri=2*(length+breadth);
		
	}

	@Override
	public void display() {		
		System.out.println("The Length is : "+this.length);
		System.out.println("The Breadth is : "+this.breadth);
		System.out.println("The area is : "+this.area);
		System.out.println("The Perimeter is : "+this.peri);	
	}

}
