package com.codeit.ex01.basic;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BasicVariable2 {
	// 기본형 Type (8가지)
	// 1. 정수형 : byte(1), short(2), int(4)★, long(8)★
	// 2. 실수 : float(4), double(8)★
	// 3. 문자 : char(2)
	// 4. 논리형 : boolean(1)★
	public static void main(String[] args) {
		// 1. 정수형 : byte(1), short(2), int(4)★, long(8)★
		byte byteValue = 127;
		short shortValue = 32767;
		int intValue = 2147483647;
		int intValue2 = 2_100_000_000;
		long longValue = 2147483647L;

		BigInteger bigIntegerValue = new BigInteger("90000000000000000000000000");
		BigDecimal bigDecimalValue = new BigDecimal("90000000000000000000000000");

		System.out.println("byteValue = " + byteValue);
		System.out.println("shortValue = " + shortValue);
		System.out.println("intValue = " + intValue);
		System.out.println("intValue2 = " + intValue2);
		System.out.println("longValue = " + longValue);

		System.out.println("bigIntegerValue = " + bigIntegerValue);
		System.out.println("bigDecimalValue = " + bigDecimalValue);

		// 2. 실수 : float(4), double(8)★
		float floatValue = 3.149149265F;
		double doubleValue = 3.149149265;

		System.out.println("floatValue = " + floatValue);
		System.out.println("doubleValue = " + doubleValue);

		// 부동소수점의 표현은 계산의 오류가 내포한다는 것을 인지해야함
		// 컴퓨터에서 부동소수점 연산은 항상 오차를 발생하나 double로 사용할 경우 오차가 극히 적음.
		// 부동소수점 표현 방법 지수부(10^-1), 가수부(314159265...)로 구성되어 있음
		// 실제 변수 크기에 따라 표현이 제한적이다!

		// BigDecimal 가급적 사용X
		BigDecimal bigDecimalValue2 = new BigDecimal("2414214125.149149265");
		System.out.println("bigDecimalValue2 = " + bigDecimalValue2);

		float testFloat = 0.1f + 0.2f;
		double testDouble = 0.1 + 0.2;

		System.out.println("testFloat = " + testFloat);
		System.out.println("testDouble = " + testDouble);

		// 3. 문자 : char(2)
		char charValue = 'A';
		char charValue1 = 65;
		char charValue2 = 'a';
		char charValue3 = 97;

		System.out.println("charValue = " + charValue);
		System.out.println("charValue1 = " + charValue1);
		System.out.println("charValue2 = " + charValue2);
		System.out.println("charValue3 = " + charValue3);

		//char 응용
		System.out.println((char)(charValue + charValue1));
		System.out.println("" + charValue + charValue1);
		System.out.println((int)'가');
		System.out.println((char)('가' + 1));
		System.out.println((char)('가' + 2));

		for (int i = 0; i <= 'Z' - 'A'; i++) {
			System.out.print((char)('A' + i) + " ");
		}
		System.out.println();

		// 4. 논리형 : boolean(1)★
		boolean boolValue = true;    // 참 - 1
		boolean boolValue1 = false; // 거짓 - 0

		System.out.println("boolValue = " + boolValue);
		System.out.println("boolValue1 = " + boolValue1);

		// 상수 : 변하지 않는 '상수'값
		// 상수 ㅂ표기법 : 모두 대문자 띄어쓰기는 _
		final int USER_MAX_VALUE = 50;
		final int USER_MIN_VALUE = 10;

		System.out.println("USER_MAX_VALUE = " + USER_MAX_VALUE);
		System.out.println("USER_MIN_VALUE = " + USER_MIN_VALUE);

	}
}
