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
		// hello() ȣ�� -> ��� "hello java"
		//sum(10, 20) -> ��� "10 + 20 = 30"
		//abs(-5) -> ���밪�� ����
		//myMax(10, 20) -> ���߿� ū�� ����
		//mySum(10) -> 1~10������ ���� ����
		//sumArr(�����迭����) -> �հ踦 ����
		int[] arr = {1, 2, 3};
		hello();
		sum(10, 20);
		System.out.println(myMax(10, 20));
		System.out.println(mySum(10));
		System.out.println(sumArr(arr));
		
	}
}
