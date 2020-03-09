
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;
		
		int arr1[]={1,2,3,4,5};
		
		int[] arr2 = new int[]{11,22,33,44};
		
		int[] arr3=new int[5];
		for(int i=0;i<arr3.length;i++)
		{
			arr3[i]=i+1;
		}
		for(int x:arr3)
			System.out.println(x);
		int[][] str = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		/*for(int[] val: str){
			for(int x : val)
			{
				System.out.println(x);
			}
		}
		*/
	
	}
	public static void printArray(int [][] str)
	{
		for(int[] val: str){
			for(int x : val)
			{
				System.out.println(x);
			}
		}
	}

}
