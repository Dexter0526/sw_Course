package com.exam;

import java.util.Arrays;

class MethodTest3{
	// prn() -> ������ 1�� �޾Ƽ� ���
	void prn(int a) {
		System.out.println(a);
	}
	// prn() -> ������ 2�� �޾Ƽ� ���ٷ� ���
	void prn(int a, int b) {
		System.out.println(a + " " + b);
	}
	// prn() -> ������ 3�� �޾Ƽ� ���ٷ� ���
	void prn(int a, int b, int c) {
		System.out.println(a + " " + b + " " + c);
	}
	
	// VarArgs(Variable Arguments) : ��������, ������
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
