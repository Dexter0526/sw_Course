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
		// 2�� for�� �̿�
		/*
 		  for ��� * 5x5 ���
 		  
		 */
		/*
		  *
		  **
		  ***
		  ****
		  ....
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		/*
		 * 2*1=2 2*2=4 ....
		 * ....
		 */
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "\t");
			}System.out.println();
		}
	}
}
