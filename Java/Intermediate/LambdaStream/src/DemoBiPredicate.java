import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;


public class DemoBiPredicate {
public static void main(String[] args) {
	BiConsumer <String,String> consumer = (str1,str2) -> System.out.println("str1 = "+str1+" str2 = "+str2);
	consumer.accept("hello", "pune");
	
	BiPredicate<String,String> predicate= (str1,str2) -> (str1.length() > str2.length());
	if(predicate.test("persistent", "pune"))
	{
		System.out.println("first is bigger than second");
	}
	
	BiFunction <String,String,String> function = (str1,str2) -> {return str1.concat(str2);};
	System.out.println(function.apply("Persistent","Pune"));
	
}
}
