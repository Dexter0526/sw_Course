package com.exam;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키 : ");
		int height = sc.nextInt(); // 키 175cm
		double dHeight; // 키 m 단위
		System.out.println("몸무게 : ");
		int weight = sc.nextInt(); // 몸무게 78kg
		
		// bmi 지수 = 몸무게 kg / 키 m의 제곱
		
		/*
		 * 비만지수 bmi		출력문장
		 * 30.0 이상		고도비만
		 * 25.0~30.0미만	비만
		 * 23.0~25.0미만	과체중
		 * 18.5~23.0미만	표준체중
		 * 18.5미만		체중미달
		 */
		dHeight = height / 100.0;
		double bmi = weight / (dHeight * dHeight);
		System.out.println(bmi);
		
		if(bmi >= 30) {
			System.out.println("고도비만");
		}else if(bmi >= 25 && bmi < 30) {
			System.out.println("비만");
		}else if(bmi >= 23 && bmi < 30) {
			System.out.println("과체중");
		}else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("표준체중");
		}else {
			System.out.println("체중미달");
		}
		
	}
}
