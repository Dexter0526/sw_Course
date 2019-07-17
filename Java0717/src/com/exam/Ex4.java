package com.exam;

import java.util.Arrays;

class MethodTest3{
	// prn() -> 정수형 1개 받아서 출력
	void prn(int a) {
		System.out.println(a);
	}
	// prn() -> 정수형 2개 받아서 한줄로 출력
	void prn(int a, int b) {
		System.out.println(a + " " + b);
	}
	// prn() -> 정수형 3개 받아서 한줄로 출력
	void prn(int a, int b, int c) {
		System.out.println(a + " " + b + " " + c);
	}
	
	// VarArgs(Variable Arguments) : 가변인자, 비정형
	void prn(int... num) {
		System.out.println(Arrays.toString(num));
	}
	
	
}

public class Ex4 {
	public static void main(String[] args) {
		MethodTest3 mt = new MethodTest3();
		mt.prn(10);
		mt.prn(10, 20);
		mt.prn(10, 20, 30);
		mt.prn(10, 20, 30, 40, 50);
	}
}
