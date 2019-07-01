package com.exam;

public class Ex5 {
	public static void main(String[] args) {
		// 제어문(조건문, 반복문)
		// 조건문 if switch
		// 반복문 for while do~while
		
		// if(조건식){
		// 조건이 참일때 실행
		//	}
		
		int a = 7; 
		if(a < 0) {
			a = -a;
		}
		System.out.println("a = " + a);
		
		a = 6;
		
		if(a%2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		a = 30;
		int b = 20;
		int min = 0;
		System.out.println("최소값 : " + min);
		
		//if() {
		//
		//}else if() {
		//	
		//}else if() {
		//	
		//}else {
		//	
		//}
		
		a = -5;
		// 양수 영 음수
		if(a > 0) {
			System.out.println("양수");
		}else if(a == 0){
			System.out.println(a);
		}else {
			System.out.println("음수");
		}
		
		int score = 55;
		// A : 90~100
		// B : 80~89
		// C : 70~79
		// D : 60~69
		// F : 0~59
		if(score >= 90) {
			System.out.println("학점은 A");
		}else if(score >= 80) {
			System.out.println("학점은 B");
		}else if(score >= 70) {
			System.out.println("학점은 C");
		}else if(score >= 60) {
			System.out.println("학점은 D");
		}else {
			System.out.println("학점은 F");
		}
		
		// A 90점 이상
		//		A+ 98~100
		//		A  94~97
		//		A- 90~93
		// B 80점 이상
		score = 95;
		String grade = "";
		if(score >= 90) {
			
		}
		
	}
}
