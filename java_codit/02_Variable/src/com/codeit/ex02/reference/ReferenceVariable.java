package com.codeit.ex02.reference;

import java.util.Date;

public class ReferenceVariable {
	public static void main(String[] args) {
		String str1 = null;
		String str2 = "안녕하세요?";
		String str3 = new String("안녕하세요?");

		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);

		//날짜 관련 Type
		Date date1 = null;
		Date date2 = new Date();
		System.out.println("date1 = " + date1);
		System.out.println("date2 = " + date2);

		Integer int1 = null;
		Integer int2 = 10;
		Integer int3 = new Integer(13);
		System.out.println("int1 = " + int1);
		System.out.println("int2 = " + int2);
		System.out.println("int3 = " + int3);
	}

}
