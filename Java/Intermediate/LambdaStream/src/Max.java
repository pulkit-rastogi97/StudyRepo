
@FunctionalInterface
public interface Max {
	int max(int num1, int num2);
	default int min(int num3,int num4)
	{
		return num4;
		
	}
	
	/*
	 * 
	 * Built-in functional interfaces
	 * 
	 * Supplier -> T get(); //supplies the data. Never accept anything
	 * Consumer -> void accept(T data);  //doesn't return anything but accepts
	 * Function -> apply() //may take data may not take. may return may not return
	 * Predicate -> boolean test(T data);     can test only one parameter  //for comparison it return boolean value results
	 * BiPredicate -> two parameters
	 * BiConsumer -> two parameters
	 * BiFunction -> two parameters
	 * 
	 * 
	 */
	static void run()
	{
		System.out.println("uulluuadf");
	}
	default String maxi(String num)
	{
		return num;
		
	}

}
