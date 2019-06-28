package com.exam;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		// 스캐너 객체 생성, 사용 연습
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 프로그램 시작 ====");
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		System.out.println("이름: " + name);
		
		System.out.print("올해 나이를 입력하세요: ");
		int age = sc.nextInt();
		System.out.println("나이: " + age);
		
		System.out.print("몸무게를 입력하세요: ");
		int weight = sc.nextInt();
		System.out.println("몸무게: " + weight);
		System.out.println("==== 프로그램 종료 ====");
		
			
		
		/* 테스팅
		 * int[][] testing = {{1,2},
							{3,4},
							{6,7}};
		
		System.out.println(testing.length);
		*/
		
		/*String test = "123";
		String temp = null;
		temp = test + "456";
		System.out.println(temp);
		*/
		
	}
}
