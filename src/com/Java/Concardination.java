package com.Java;

public class Concardination {

	public static void Concordination() {

		String s = "Logeshwari";
		String s1 = "Harini";
		String s2 = "Dinesh";

		String concat = s.concat(s1).concat(s2);

		String concat2 = s.concat(s1.concat(s2));

		System.out.println(s1.concat(s.concat(s2)));
		System.out.println(concat2);

	}

	public static void main(String[] args) {

		Concordination();
	}

}
