import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CollectDemo {
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(45,78,12,13,34,89,90);
	
	Stream<Integer> stream = list.stream();
	List<Integer> sortedlist = stream.sorted().collect(Collectors.toList());
	for(Integer i : sortedlist)
	{
		System.out.println(i);
	}
	/*
	 * 
	 * 
	 */
	//HashMap<Integer,String> hashMap = 
}
}