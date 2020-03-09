import java.util.Set;
import java.util.TreeMap;


public class HashTable {

	public static void main(String[] args) {
		TreeMap<Integer,String> table = new TreeMap<Integer,String>();
		//Hashtable<Integer,String> table = new Hashtable<Integer,String>();
		table.put(101,"IT");
		table.put(110, "Mechanical");
		table.put(90, "civil");
		table.put(80, "computer");
		table.put(010, "biology");
		table.put(60, "chemical");
		table.put(845, "marketing");
		table.put(110, "business");
		table.put(6340, "Mechanical");
		//table.put(null,"hello");
		System.out.println(table);
		
		
		Set<Integer> keys = table.keySet();
		for(Integer key : keys )
		{
			String value = table.get(key);
			System.out.println(key + " " +value);
		}
	}
}
