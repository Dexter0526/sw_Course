package com.exam;

public class Ex4 {
	public static void main(String[] args) {
		// 1~10 반복
		// 1~10 누적합
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10까지의 합 : " + sum);

		// 1~100까지 누적합
		for(int i = 1; i <= 100; i++) {
			sum += i;
			System.out.println("1~100까지 누적합 : " + sum);
		}
		// 1~10 중 홀수의 합
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				sum += i;
				System.out.println("1~10 중 홀수의 합 : " + sum);
			}
		}
		
	}
}
