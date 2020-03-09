
public class QueueMain {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<>();
		queue.enqueue(10);
		queue.dequeue();
		queue.enqueue(6);
		queue.enqueue(52);
		queue.enqueue(89);
		queue.enqueue(78);
		queue.dequeue();
		queue.enqueue(5);
		queue.print();
		
	}
}
