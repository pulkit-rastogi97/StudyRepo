import java.util.ArrayList;
import java.util.List;


public class CoherentReturnMain {
	
	public static void main(String[] args) {
		
		List<Object> ref = getObject();
		System.out.println("ref = "+ref);
	}
	
	public static List<Object> getObject()
	{
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("abc");
		list.add(12);
		list.add(null);
		list.add(true);
		list.add(12.3f);
		list.add(21.22d);
		
		return list;
	}

}
