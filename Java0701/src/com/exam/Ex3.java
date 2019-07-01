package com.exam;

public class Ex3 {
	public static void main(String[] args) {
		// 대입 연산자 = += -= *= /= %=
		int a;
		a = 10;
		
		a = a + 1;
		System.out.println("a = " + a);
		
		a++;
		System.out.println("a = " + a);
		
		// 확장대입연산자
		a += 1;
		System.out.println("a = " + a);
		
		a++;
		System.out.println("a = " + a);
		
		a *= 10;
		System.out.println("a = " + a);
		
	}
}
