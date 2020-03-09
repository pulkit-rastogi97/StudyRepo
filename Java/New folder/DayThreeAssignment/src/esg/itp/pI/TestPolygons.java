package esg.itp.pI;

import esg.itp.shape.*;

public class TestPolygons {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(3.3f,4.5f);
		r.calArea();
		r.calPeri();
		r.display();
		
		
		Square s = new Square(5.5f);
		s.calArea();
		s.calPeri();
		s.display();
	}
}
