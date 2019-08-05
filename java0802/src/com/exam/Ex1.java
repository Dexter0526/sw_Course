package com.exam;

public class Ex1 {

	public static void main(String[] args) {
		// Wrapper 클래스
		// Byte, Short, Integer, Long - 정수형
		// Float, Double - 실수형
		// Character - 문자형
		// Boolean - 논리형(불리언형)

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		// Wrapper 타입 객체 생성
		Integer i = Integer.valueOf(10);
		Integer i2 = Integer.valueOf("10");

		System.out.println(i.toString());

		Character c = Character.valueOf('c');
		Boolean b = Boolean.valueOf(true);

		// 문자열 리터럴을 받으면 해당 타입으로 변환함.
		Double d = Double.valueOf("3.14");

		// Wrapper 객체 들어있는 기본타입 값 가져오기
		int ii = i.intValue();
		System.out.println(ii);

		boolean bb = b.booleanValue();
		double dd = d.doubleValue();

		// 문자열을 기본타입으로 변환★★★
		int iii = Integer.parseInt("123");
		double ddd = Double.parseDouble("3.14");
		boolean bbb = Boolean.parseBoolean("true");
		System.out.println(bbb);

		// 기본 타입 값을 문자열로 변환
		String s1 = Integer.toString(123); // "123"
		String s2 = Integer.toBinaryString(3); // 2진수 문자열
		System.out.println(s2); // 11
		String s3 = Integer.toOctalString(8); // 8진수 문자열
		System.out.println(s3);
		String s4 = Double.toString(3.14);
		System.out.println(s4);

		// 수동 박싱
		Integer ten1 = Integer.valueOf(10);
		// 수동 언박싱
		int num1 = ten1.intValue();

		ten1 = Integer.valueOf(i.intValue() + i2.intValue());

		
		// 자동 박싱
		Integer ten2 = 10;
		// 자동 언박싱
		int num2 = ten2;

		ten2 = i + i2;

	} // main method

}
