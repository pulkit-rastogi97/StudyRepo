
public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> obj1 = new Stack<Integer>();
		obj1.push(10);
		obj1.push(20);
		obj1.push(30);
		obj1.pop();
		obj1.push(45);
		obj1.push(999);
		obj1.pop();
		obj1.print();		
	}
}
