package com.Java;

public class Swaping_int {
	
	static int a,b,c;
	
	public static void Method_1() {

		a = 10;
		b = 20;
		
		c = a;
		a = b;
		b = c;
		System.out.println(a + "  " + b + "  " + c);
	}
	
	public static void Method_2() {

		a = 10;
		b = 20;
	
		a = a+b;
	 	b = a-b;
		a = a-b;
		System.out.println(a + "  " + b);

	}

	public static void main(String[] args) {
		
		Method_1();
		Method_2();
	}
}
