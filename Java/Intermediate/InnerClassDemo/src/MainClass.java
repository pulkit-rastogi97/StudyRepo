//	`import ClassOuter.InnerClass;




public class MainClass {
public static void main(String[] args) {
	
	//ClassOuter.createObject().method(100, "xyz");
	
	ClassOuter.InnerClass ref = new ClassOuter.InnerClass();
	
	ref.method(100, "hii");
}
}