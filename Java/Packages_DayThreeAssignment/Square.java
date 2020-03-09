package esg.itp.shape;

public class Square implements Polygon{
	
	private float side;
	private float area;
	private float peri;
	
	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	public Square(float s)
	{
		this.side=s;
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

	@Override
	public void calArea() {
		this.area= side*side;
		
	}

	@Override
	public void calPeri() {
		this.peri=4*side;
		
	}

	@Override
	public void display() {		
		System.out.println("The side length is : "+this.side);
		System.out.println("The area is : "+this.area);
		System.out.println("The Perimeter is : "+this.peri);	
	}


	
	
}
