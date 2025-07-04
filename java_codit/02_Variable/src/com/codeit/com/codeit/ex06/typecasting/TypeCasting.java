package com.codeit.com.codeit.ex06.typecasting;

public class TypeCasting {
	// TypeCasting이란? type간의 형을 변환하는 방법, ex) int -> long, int -> double

	// 종류 2가지
	// 1) 자동 형변환 : 작은 Type에서 큰 Type으로 갈 때, 아무 문제가 없고, cast를 명시하지 않아도 된다. (묵시적 형변환)
	// 2) 강제 형변환 : 큰 Type에서 작은 Type으로 갈 때, 데이터 손실이 발생할수 있다. (명시적 형변환)
	//                     반드시 cast 문법을 명시해야한다. -> 안하면 에러 발생 -> 프로그램이 죽는다!
	public static void main(String[] args) {
		byte value = 100;
		value = 123;
		value = (byte)123;
		value = (byte)40000;
		System.out.println("value = " + value);

		int intValue = 0;
		long longValue = 0L;
		double doubleValue = 0.0;
		float floatValue = 0.0F;
	}

}
