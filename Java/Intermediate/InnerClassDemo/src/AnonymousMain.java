
public class AnonymousMain {
	
	public static void main(String[] args) {
		Demo ref = new Demo(){

			@Override
			public int calculate(int num) {
				// TODO Auto-generated method stub
				return num*num;
			}
			
		};
		
		int res = ref.calculate(10);
		System.out.println("res = "+res);
	}

}
