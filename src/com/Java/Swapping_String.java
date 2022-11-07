package com.Java;

public class Swapping_String {

	static String s1 = "Logeshwari";
	static String s2 = "Harini";

	public static void With_third_variable() {

		String s3 = s1;
		s1 = s2;
		s2 = s3;

		System.out.println(s1 + " " + s2);
	}

	public static void Without() {

		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println(s2 + " " + s1);

	}

	public static void main(String[] args) {

		// With_third_variable();
		Without();
	}
}
