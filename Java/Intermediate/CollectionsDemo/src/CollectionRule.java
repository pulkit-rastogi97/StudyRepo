import java.util.List;
import java.util.ArrayList;


public class CollectionRule {


	public static void main(String[] args) {
		
		ArrayList<A> list1= new ArrayList<A>();
		list1.add(new A());
		list1.add(new B());
		list1.add(new C());
		
		ArrayList<B> list2 = new ArrayList<>();
		//list2.add(new A());
		list2.add(new B());
		list2.add(new C());
		
		
		List<C> list3 = new ArrayList<C>();
//		list3.add(new A());
//		list3.add(new B());
		list3.add(new C());
		
		printList(list2);
		//printList(list3);
		printList(list1);

		
	}
	public static void printList(ArrayList<? super B> list)
	{
		System.out.println(list);
	}
}
