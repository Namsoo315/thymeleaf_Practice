package com.codeit.ex04.var;

import java.util.ArrayList;

public class VarPractice {
	public static void main(String[] args) {
		var name = "홍길동";
		var age = 25;
		var list = new ArrayList<String>();

		System.out.println("name = " + name);
		System.out.println("age = " + age + 5);
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println("list = " + list);
		;
	}
}
