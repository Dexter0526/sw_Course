package com.exam;

public class Test {
	
	public int f(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
//		System.out.println(f(10, 20));
		
		Test test = new Test();
		int sum = test.f(2, 4);
		
		System.out.println(sum);
	} // main method

}
