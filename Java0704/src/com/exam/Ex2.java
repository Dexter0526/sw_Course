package com.exam;

public class Ex2 {
	public static void main(String[] args) {
		
		// for�� 1~100 �� �߿���
		// if�� 3�� 4�� ����� ���
		//  -> 3���� ������ �������� 4�ε� ������ �������� ��
		
		for(int i = 1; i < 100; i++) {
			if(i % 3 == 0 && i % 4 == 0) {
				System.out.println("3�� 4�� �����" + i);
			}
		}
		
		int oddSum = 0; // Ȧ���� ��
		int evenSum = 0; // ¦���� ��
		// 1~10
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) oddSum += i;
			else evenSum += i;
		}
		System.out.println("Ȧ���� �� : " + oddSum);
		System.out.println("¦���� �� : " + evenSum);
		
	}
}
