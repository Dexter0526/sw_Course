package com.exam;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Math Ŭ������ random() �޼ҵ� �̿��ؼ�
		// ������ ���� �����

		/*
		 * Math.random() �޼ҵ� ȣ���ϸ�
		 * 0.0~1.0 ������ �Ǽ��� ����
		 * 0~0.99999	Math.random()
		 * 0.0~2.00		(Math.random()*3)
		 * 0~2			(int)(Math.random()*3)
		 * 1~3			(int)(Math.random()*3)+1
		 */
		int num = (int)(Math.random()*3)+1;
		String com = "";
		switch (num) {
		case 1: com = "����";		
		break;
		case 2: com = "����";		
		break;
		case 3: com = "��";		
		break;
		}

		System.out.println("���������� �����Դϴ�. ");
		System.out.println("����, ����, �� �߿��� �Է��ϼ���.");
		System.out.print("����� >> ");
		String user = sc.nextLine();
		System.out.println("��ǻ�� >> " + com);
		String answer = "";

		if(user.equals("����")) {
			if(com.equals("����")) {
				answer = "Draw";
			}else if(com.equals("����")){
				answer = "Lose";
			}else {
				answer = "Win";
			}
		}else if(user.equals("����")) {
			if(com.equals("����")) {
				answer = "Win";
			}else if(com.equals("����")){
				answer = "Draw";
			}else {
				answer = "Lose";
			}
		}else {
			if(com.equals("����")) {
				answer = "Lose";
			}else if(com.equals("����")){
				answer = "Win";
			}else {
				answer = "Draw";
			}
		}
		System.out.println("��� : " + answer);
		sc.close();

	}
}