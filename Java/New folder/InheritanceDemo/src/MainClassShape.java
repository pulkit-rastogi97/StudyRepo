
public class MainClassShape {

	public static void main(String[] args) {
		
		Shape ref = null;
		
		ref = new Circle(4);
		System.out.println("area of a circle : "+ref.calArea());
		
		
		ref = new Rectangle(4,5);
		System.out.println("area of a rectangle : "+ref.calArea());
		
	}

}
 