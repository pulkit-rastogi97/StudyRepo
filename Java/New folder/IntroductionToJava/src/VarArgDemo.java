
public class VarArgDemo {

	public static int add( String str,int ...args)
	{
		int sum=0;
		for(int x: args)
		{
			sum+=x;
		}
		return sum+str.length();
	}
	public static void main(String[] args) {
		int res1 = add("Hello",1);
		int res2= add("Hello",1,2);
		int res3 = add("Hello",1,2,3,4);
		int res4 = add("Hello");
		System.out.println(res1+" "+res2+" "+res3+" "+res4+" ");

	}

}
