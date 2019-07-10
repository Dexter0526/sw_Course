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
	public static int[] sumArr(int[] arr) {
		int[] answer = new int[2];
		for(int num : arr) {
			answer[0] += num;
		}answer[1] =  answer[0]/arr.length;
		return answer;
	}
	public static void main(String[] args) {
		// hello() 호출 -> 출력 "hello java"
		//sum(10, 20) -> 출력 "10 + 20 = 30"
		//abs(-5) -> 절대값을 리턴
		//myMax(10, 20) -> 둘중에 큰값 리턴
		//mySum(10) -> 1~10까지의 합을 리턴
		//sumArr(정수배열전달) -> 합계를 리턴
		int[] arr = {1, 2, 3};
		hello();
		sum(10, 20);
		System.out.println(myMax(10, 20));
		System.out.println(mySum(10));
		System.out.println(sumArr(arr));
		
	}
}
