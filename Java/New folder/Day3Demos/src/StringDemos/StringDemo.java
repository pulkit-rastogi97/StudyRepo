package StringDemos;

public class StringDemo {

	public static void main(String[] args) {
		
	
	//object goes to heap memory
	String str1 = new String("Pune");
	
	//object goes to String pool
	String str2 = "Pune";
	String str3 = "Pune";
	
	if(str1==str2)
		System.out.println("str 1 and str2 are equal");
	if(str2==str3)
		System.out.println(" str2 and str3 are equal");
	
	
	String str4 = "Persistent";
	String str5 = "Pune";
	
	System.out.println("before concat str4 = "+str4);
	System.out.println(str4.concat(str5));
	System.out.println("after concat str4 = "+str4);
	System.out.println("char at loc 3 is  = "+str4.charAt(3));
	System.out.println("index of s in str 4 = "+str4.indexOf("s"));
	System.out.println("last index of e in str 4 = "+str4.lastIndexOf("e"));
	System.out.println("length of str 4 = "+str4.length());
	System.out.println("length of str 5 = "+str5.length());
	System.out.println("lowecase of str4 = "+str4.toLowerCase());
	System.out.println("replace e with a = "+str4.replace("e", "a"));
	System.out.println("after replacement str4 = "+str4);
	System.out.println("substring str4 from 2 to 5 = "+str4.substring(2,5));
	
	
}
}