package com.exam;

import java.awt.Toolkit;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ���� ���߱� ����
		// 1�ܰ� : 6, 7, 8, 9 �� ������ ������ ������. 
		// -������ ������ ����� ���ߴ� ����.
		// 
		// 2�ܰ� : ¦������ Ȧ������ ��Ʈ�ֱ�
		// -¦���� "¦���Դϴ�"
		// -Ȧ���� "Ȧ���Դϴ�"

		// 3�ܰ� : ����� �Է� ���ڰ� �ޱ�

		// 4�ܰ� : ����� �Է°��� ��ǻ�Ͱ��� ��
		//
		// Math.random()*4+3;


		int com;
		int user;
		// 1�ܰ�
		com = (int) (Math.random()*4+6);

		// 2�ܰ�
		if(com % 2 == 0) System.out.println("¦���Դϴ�");
		else System.out.println("Ȧ���Դϴ�");

		// 3�ܰ�
		System.out.print("���ڸ� �Է��ϼο� : ");
		user = sc.nextInt();

		// 4�ܰ�
		if(user == com) System.out.println("������ϴ�");
		else System.out.println("����...");
		System.out.println("�Է°� : " + user + 
				", ��ǻ�Ͱ� : " + com);

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		toolkit.beep(); // ������ �Ҹ� ���

		/*
		 * 1, 2, 3 �� ������ ���� �� 3�� ����
		 * ���� 3���� ��� ������ ����~!
		 * �ٸ��� �ݾ��� �Ҵ�...
		 * 
		 */


		// ���� ���߱� ����
		// 1�ܰ� : 1~100 �� ������ ������ ������. 
		// -������ ������ ����� ���ߴ� ����.
		// 
		// 2�ܰ� : ¦������ Ȧ������ ��Ʈ�ֱ�
		// -¦���� "¦���Դϴ�"
		// -Ȧ���� "Ȧ���Դϴ�"

		// 3�ܰ� : ����� �Է� ���ڰ� �ޱ�
		// �Է¹޴� ���ڰ� 1~100���̰� �ƴҰ�� ���Է�

		// 4�ܰ� : ����� �Է°��� ��ǻ�Ͱ��� ��
		// -�� if ����ڰ� > ��ǻ�Ͱ�(����ߵɰ�)
		// 		-> "�� ������ �Է��ϼ���"
		// -�� if ����ڰ� < ��ǻ�Ͱ�(����ߵɰ�)
		// 		-> "�� ū�� �Է��ϼ���"
		// -�� if ����ڰ� = ��ǻ�Ͱ�(����ߵɰ�)
		// 		-> "������ϴ�."
		//			"�õ�Ƚ�� : x"

		// Math.random()*100;
		
		com = (int) (Math.random()*100+1);
		int count = 0;
		System.out.println(com);

		// 2�ܰ�
		if(com % 2 == 0) System.out.println("¦���Դϴ�");
		else System.out.println("Ȧ���Դϴ�");

		// 3�ܰ�
		while(true) {
			System.out.print("���ڸ� �Է��ϼο� : ");
			user = sc.nextInt();
			count++;
			if(user < 1 || user > 100) {
				System.out.print("���ڸ� ���Է��ϼο� : ");
				user = sc.nextInt();
				count++;
			}
			// 4�ܰ�
			else {
				if(user == com) {
					System.out.println("������ϴ�");
					System.out.println("�õ�Ƚ�� : " + count);
					break;
				}else if(user > com) {
					System.out.println("�� ������ �Է��ϼ���");
				}else if(user < com) {
					System.out.println("�� ū�� �Է��ϼ���");
				}

			}
		}

		sc.close();
	}
}
