package com.codeit.ex03.string;

public class StringPractice {
	public static void main(String[] args) {
		String str = "abc";
		str = new String("abd");
		System.out.println("str = " + str);

		str = "ABC" + "DEF";
		System.out.println("str = " + str);

		int value = 123 + 45; // 168
		System.out.println("value = " + value);
		str = 123 + 45 + "ABC" + "DEF";

		System.out.println("str = " + str);
		System.out.println("----------------------------------------");
	}
}
