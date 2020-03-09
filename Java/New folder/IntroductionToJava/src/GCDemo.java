
public class GCDemo {
public static void main(String[] args) {
	Student ref1 = new Student(11,90,"");
	Student ref2 = new Student();
	Student ref3 = ref1;
	Student ref4 = ref2;
	
	Student ref5 = check(ref4);
	ref3=ref1=null;
	System.gc();
}
public static Student check(Student ref)
{
	Student ref6=ref;
	ref=null;
	return ref6;
}
}
