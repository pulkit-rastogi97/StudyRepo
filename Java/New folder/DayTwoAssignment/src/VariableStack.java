
public class VariableStack implements Stack{
	private int size;
	private int n=0;
	int count;
	
	public VariableStack(int size)
	{
		this.size=size;
		
	}
	int[] arr = new int[size];
	@Override
	public void push(int i) {
		if(count==0)
		{
			int temp=size+10;
			size=temp;
			{
				int[] newArr=new int[size];
				
			}
		}
		else
		{
			arr[n]=i;
			n++;
			count--;
		}
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		return 0;
	}

}
