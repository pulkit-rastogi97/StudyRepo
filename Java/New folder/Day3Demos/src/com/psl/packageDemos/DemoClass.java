package com.psl.packageDemos;

public class DemoClass {
	public static int data = 100;
	public static void method(){
		{
			System.out.println("static from DemoClass");
		}
	}
	public void method2(){
		System.out.println("Not from static");
	}

}
