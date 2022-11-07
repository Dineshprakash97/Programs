package com.Java;

public class String_Reverse {

	static String s = "Training programs";

	public static void Reverse() {

		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			System.out.print(ch);
		}

		System.out.println();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			System.out.print(c);
		}

		System.out.println();
	}
	
	public static void Buffer() {

		StringBuffer sb = new StringBuffer("Logeshwari");
		StringBuffer sb1 = sb.reverse();
		System.out.println(sb1);
		
		StringBuffer sb2 = sb1.reverse();
		System.out.println(sb2);
	}

	public static void main(String[] args) {

		Reverse();
		Buffer();
	}

}
