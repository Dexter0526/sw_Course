package com.exam;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ű : ");
		int height = sc.nextInt(); // Ű 175cm
		double dHeight; // Ű m ����
		System.out.println("������ : ");
		int weight = sc.nextInt(); // ������ 78kg
		
		// bmi ���� = ������ kg / Ű m�� ����
		
		/*
		 * ������ bmi		��¹���
		 * 30.0 �̻�		����
		 * 25.0~30.0�̸�	��
		 * 23.0~25.0�̸�	��ü��
		 * 18.5~23.0�̸�	ǥ��ü��
		 * 18.5�̸�		ü�߹̴�
		 */
		dHeight = height / 100.0;
		double bmi = weight / (dHeight * dHeight);
		System.out.println(bmi);
		
		if(bmi >= 30) {
			System.out.println("����");
		}else if(bmi >= 25 && bmi < 30) {
			System.out.println("��");
		}else if(bmi >= 23 && bmi < 30) {
			System.out.println("��ü��");
		}else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("ǥ��ü��");
		}else {
			System.out.println("ü�߹̴�");
		}
		
	}
}
