package com.exam;

public class Ex3 {
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {	// ��(row)
			for(int j = 0; j < 5; j++) {	// ��(column)
				System.out.print("*");
			}System.out.println();
		}

		// �ð� (�� 0~23, �� 0~59)
		// 0�� 0��
		// 0�� 1��
		// ...

		for(int i = 0; i < 24; i++) {
			for(int j = 0; j < 60; j++) {
				System.out.println(i + "�� " + j + "��");
			}
		}
		
	}
}
