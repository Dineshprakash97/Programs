package com.Java;

public class Reverse_2 {

	static String s = "Classmate Notebook";

	public static void Method_1() {

		String[] allwords = s.split(" ");

		String reverseSentence = "";

		for (String word : allwords) {

			String reverse = "";

			for (int i = word.length() - 1; i >= 0; i--) {
				char ch = word.charAt(i);
				reverse = reverse + ch;
				//System.out.print(reverse);
			}

			reverseSentence = reverseSentence + reverse + " ";
		}

		System.out.println(reverseSentence);
	}

	public static void main(String[] args) {

		Method_1();
	}

}
