package Question6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericDemo {

	public static void printList(Collection<?> list)
	{
		System.out.println(list);
	}
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(9);
		list.add(90);
		list.add(12);
		
		Set<String> set = new HashSet<String>();
		set.add("Pulkit");
		set.add("Manvi");
		
		
		printList(list);
		
		printList(set);
		
	}

}
