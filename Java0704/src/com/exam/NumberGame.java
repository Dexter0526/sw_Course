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
		// -��ġ�ϸ� "������ϴ�!!"
		// -�ٸ��� "����..."
		// ��� "�Է°� : x, ��ǻ�Ͱ� : y"
		
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
		
		sc.close();
	}
}
