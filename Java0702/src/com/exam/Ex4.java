package com.exam;

public class Ex4 {
	public static void main(String[] args) {
		// 1~10 �ݺ�
		// 1~10 ������
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10������ �� : " + sum);

		// 1~100���� ������
		for(int i = 1; i <= 100; i++) {
			sum += i;
			System.out.println("1~100���� ������ : " + sum);
		}
		// 1~10 �� Ȧ���� ��
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				sum += i;
				System.out.println("1~10 �� Ȧ���� �� : " + sum);
			}
		}
		
	}
}
