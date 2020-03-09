public class ClassOuter {

	protected String name;
	private static int add=90;
	

	static class InnerClass {

		public void method(int num, String nm) {
			add = num;
			/*number = num;
			name = nm;*/
			System.out.println("number = " + num + " name  = " + nm);
			System.out.println("add = "+add);
		}
	}

	/*static public InnerClass createObject() {
		InnerClass ref = new ClassOuter().new InnerClass();
		// System.out.println("address = ");//+address);
		return ref;
	}*/
}
