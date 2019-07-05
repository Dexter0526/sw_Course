package com.exam;

// 과제
public class Ex2 {

	public static void main(String[] args) {
		int answer = 0;
		// 과제1.
		// for문
		// (1) + (1+2) + (1+2+3) + ... + (1+2+3+..+10)
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				answer += j;
			}
			// 테스트 출력
			System.out.println(answer);
		}
		
		// 과제2.
		// (1) + (-2) + (3) + (-4) + ....+ (-10)
		answer = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) answer += -i;
			else answer += i;
		}
		// 테스트 출력
		System.out.println(answer);
		
		// 과제3.
		// 두개의 주사위를 던졋을때 눈의합이 6이 되는
		// 1 - 5
		// 2 - 4
		answer = 0;
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				answer = i + j;
				if(answer == 6) {
					//테스트 출력
					System.out.println(i + " - " + j);
				}
			}
		}
		
		
		// 과제4.
		// 2x + 4y = 10		0 <= x <= 10	0 <= y <= 10
		// x = 1, y = 2
		// x = 3, y = 1
		// x = 5, y = 0
		answer = 0;
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= 10; j++) {
				answer = 2*i + 4*j;
				if(answer == 10) {
					System.out.println("x = " + i + ", y = " + j);
				}
			}
		}
		
	}
	
}
