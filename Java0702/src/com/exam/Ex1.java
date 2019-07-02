package com.exam;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		// switch문
		
		// break : switch문, 모든 반복문
		
		//switch(변수 또는 수식) {
		//case 값1: 명령문; break;
		//case 값2: 명령문; break;
		//default:
		//}
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch(ch) {
		case 1: ch = '월'; break;
		case 2: ch = '화'; break;
		case 3: ch = '수'; break;
		case 4: ch = '목'; break;
		case 5: ch = '금'; break;
		case 6: ch = '토'; break;
		case 7: ch = '일'; break;
		}
		
		
		char grade = 'a';
		// 'A' 매우우수 'B' 우수 'C' 보통
		// 'D' 미흡 'F' 매우미흡
		String text = "";
		switch(grade) {
		case 'A': text = "매우우수"; break;
		case 'B': text = "우수"; break;
		case 'C': text = "보통"; break;
		case 'D': text = "미흡"; break;
		case 'F': text = "매우미흡"; break;
		}
		
	}
}
