package com.exam;

import java.util.Scanner;

public class SucceessOrFail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		int score = sc.nextInt();
		if(score >= 80) {
			System.out.println("�հ�.");
		}
		sc.close();
	}
}
