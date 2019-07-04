package com.exam;

public class Ex2 {
	public static void main(String[] args) {
		
		// for문 1~100 수 중에서
		// if문 3과 4의 공배수 출력
		//  -> 3으로 나누어 떨어지고 4로도 나누어 떨어지는 수
		
		for(int i = 1; i < 100; i++) {
			if(i % 3 == 0 && i % 4 == 0) {
				System.out.println("3과 4의 공배수" + i);
			}
		}
		
		int oddSum = 0; // 홀수의 합
		int evenSum = 0; // 짝수의 합
		// 1~10
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) oddSum += i;
			else evenSum += i;
		}
		System.out.println("홀수의 합 : " + oddSum);
		System.out.println("짝수의 합 : " + evenSum);
		
	}
}
