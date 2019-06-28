package com.exam;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 a값을 입력하세요 : ");
		int a = sc.nextInt();
		System.out.println();
		
		System.out.print("숫자 b값을 입력하세요 : ");
		int b = sc.nextInt();
		System.out.println();
		
		int c = a + b;
		System.out.println(c);
		
		boolean result = a > b;
		System.out.println("a > b -> " + result);
		
		System.out.println("a < 100 - > " + (a < 100));
		
		System.out.println("a == b -> " + (a == b)); 
		
		System.out.println("a != b -> " + (a != b));
		
		int max = (a > b) ? a : b;
		
		System.out.println("최대값 : " + max);
		
		int min = (a > b) ? b : a;
		
		System.out.println("최소값 : " + min);
		
		// a의 절대값
		// 양수 -> 양수, 음수 -> 양수
		int abs = (a < 0) ? a*(-1) : a;
		System.out.println("변수 a의 절대값 : " + abs);
		
		System.out.println("==== 프로그램 종료 ====");
		
		// 삼항(조건)연산자
		// 
		// 최대값 
		
	}
}
