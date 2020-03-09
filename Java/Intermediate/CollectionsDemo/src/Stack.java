import java.util.*;

public class Stack<T> {

	List<T> list = new ArrayList<T>();
	int index;

	public Stack() {
		index++;
	}

	T pop() {
		T element = list.get(list.size()-1);
		list.remove(list.size()-1);
		return element;
	}

	void push(T element) {
		list.add(element);
	}

	public void print()
	{
		for(T element : list)
		{
			System.out.println(element);
		}
	}
	
}
