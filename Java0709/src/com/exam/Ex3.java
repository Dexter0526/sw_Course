package com.exam;

public class Ex3 {
	public static void hello(){
		System.out.println("hello java");
	}
	public static void sum(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	public int abs(int a) {
		int answer = a;
		if(a < 0) {
			answer = -a;
		}
		return answer;
	}
	public static int myMax(int a, int b) {
		int answer = 0;
		answer = Math.max(a, b);
		return answer;
	}
	public static int mySum(int a) {
		int answer = 0;
		for(int i = 1; i <= a; i++) {
			answer += i;
		}
		return answer;
	}
	public static void main(String[] args) {
		// hello() 호출 -> 출력 "hello java"
		
		//sum(10, 20) -> 출력 "10 + 20 = 30"
		//abs(-5) -> 절대값을 리턴
		//myMax(10, 20) -> 둘중에 큰값 리턴
		//mySum(10) -> 1~10까지의 합을 리턴
		hello();
		sum(10, 20);
		System.out.println(myMax(10, 20));
		System.out.println(mySum(10));
		
	}
}
