import java.util.HashSet;
import java.util.stream.Stream;


public class HashSetStream {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Pune");
		set.add("Nagpur");
		set.add("Hyderabad");
		set.add("Goa");
		set.add("Mumbai");
		
		Stream<String> stream = set.stream();
		stream.map((str)-> str.indexOf('e')).forEach((str)->System.out.println(str));
	}

}
