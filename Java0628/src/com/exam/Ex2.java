package com.exam;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� a���� �Է��ϼ��� : ");
		int a = sc.nextInt();
		System.out.println();
		
		System.out.print("���� b���� �Է��ϼ��� : ");
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
		
		System.out.println("�ִ밪 : " + max);
		
		int min = (a > b) ? b : a;
		
		System.out.println("�ּҰ� : " + min);
		
		// a�� ���밪
		// ��� -> ���, ���� -> ���
		int abs = (a < 0) ? a*(-1) : a;
		System.out.println("���� a�� ���밪 : " + abs);
		
		System.out.println("==== ���α׷� ���� ====");
		
		// ����(����)������
		// 
		// �ִ밪 
		
	}
}
