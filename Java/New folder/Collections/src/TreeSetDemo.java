import java.util.TreeSet;


public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("pune");
		set.add("mumbai");
		set.add("nagpur");
		set.add("gurgaon");
		
		for(String s : set)
			System.out.println(s);
	}
}
