package com.exam;

import java.util.Scanner;

public class SucceessOrFail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		if(score >= 80) {
			System.out.println("합격.");
		}
		sc.close();
	}
}
