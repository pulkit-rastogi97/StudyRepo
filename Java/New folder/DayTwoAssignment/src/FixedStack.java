
public class FixedStack implements Stack{

	private int size;
	private int n=0;
	int count;
	int[] arr = new int[size];
	public FixedStack(int size)
	{
		this.size=size;
		count=size;
	}

	@Override
	public void push(int i) {
		if(count==0)
			System.out.println("Stack OverFlow");
		else
		{
			arr[n]=i;
			n++;
			count--;
		}
			
	}

	@Override
	public int pop() {
		int temp = arr[n-1];
		arr[n-1]=0;
		return temp;
	}
}
