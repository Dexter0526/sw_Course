package com.exam;

class MethodTest2{
	int abs(int a) {
		return Math.abs(a);
	}
}

public class Ex1 {
	public static void main(String[] args) {
		MethodTest2 mt = new MethodTest2();
		System.out.println(mt.abs(-5));
	}
}
