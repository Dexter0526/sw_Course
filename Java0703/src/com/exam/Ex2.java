package com.exam;

public class Ex2 {
	public static void main(String[] args) {
		// 2��
		// 2 * 1 = 2
		// 2 * 2 = 4
		// ....
		for(int i = 1; i < 10; i++) {
			System.out.println("2 * " + i + " = " + (2*i));
		}
		
		// 5��
		for(int i = 1; i < 10; i++) {
			System.out.println("5 * " + i + " = " + (5*i));
		}
		
		int f = 0; // ȭ�� �µ�
		// �����µ� (0��~100��)
		// ȭ���µ� = �����µ� * 9 / 5 + 32
		// ��� " ���� � -> ȭ�� �"
		for(int i = 0; i <= 100; i++) {
			f = (i * 9 / 5) + 32;
			System.out.println("���� : " + i + "�� -> "+
			"ȭ�� : " + f + "��");
		}
	}
}
