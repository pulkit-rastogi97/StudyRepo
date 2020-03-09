
public class OperationsImpl implements Operations{

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public void swap(int x, int y) {
		System.out.println(" Values entered are \nx : "+x+" \ny : "+y);
		int temp=x;
		x=y;
		y=temp;		
		System.out.println(" Values after swap are \nx : "+x+" \ny : "+y);
		
	}

}
