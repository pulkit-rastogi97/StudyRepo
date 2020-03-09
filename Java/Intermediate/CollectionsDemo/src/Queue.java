
public class Queue <T> {
	
	int front,rear;
	@SuppressWarnings("unchecked")
	T[] queue = (T[])new Object[50];
	public Queue()
	{
		rear=front=-1;
	}
	
	public void enqueue(T element)
	{
		if((rear==-1)&&(front==-1))
		{
			rear=front=0;
			queue[rear]=element;
		}
		else if(rear==49)
		{
			System.out.println("Queue is full");
			return;
		}
		else
		{
			rear++;
			queue[rear]=element;
		}
	}
	
	public T dequeue()
	{
		if(front==-1)
			return null;
		else if(front == 49)
		{
			front=rear=-1;
			return queue[front];
		}
		else
		{
			T temp=queue[front];
			queue[front]=null;
			front++;			
			return temp;
		}
	
	}
	public void print()
	{
		for(int i = front; i <= rear ;i++)
		{
			System.out.print(queue[i] + " ");
		}
	}

}
