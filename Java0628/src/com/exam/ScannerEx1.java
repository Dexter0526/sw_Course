package com.exam;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		// ��ĳ�� ��ü ����, ��� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== ���α׷� ���� ====");
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.nextLine();
		System.out.println("�̸�: " + name);
		
		System.out.print("���� ���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
		System.out.println("����: " + age);
		
		System.out.print("�����Ը� �Է��ϼ���: ");
		int weight = sc.nextInt();
		System.out.println("������: " + weight);
		System.out.println("==== ���α׷� ���� ====");
		
			
		
		/* �׽���
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
