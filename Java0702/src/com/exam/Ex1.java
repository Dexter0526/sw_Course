package com.exam;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		// switch��
		
		// break : switch��, ��� �ݺ���
		
		//switch(���� �Ǵ� ����) {
		//case ��1: ��ɹ�; break;
		//case ��2: ��ɹ�; break;
		//default:
		//}
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch(ch) {
		case 1: ch = '��'; break;
		case 2: ch = 'ȭ'; break;
		case 3: ch = '��'; break;
		case 4: ch = '��'; break;
		case 5: ch = '��'; break;
		case 6: ch = '��'; break;
		case 7: ch = '��'; break;
		}
		
		
		char grade = 'a';
		// 'A' �ſ��� 'B' ��� 'C' ����
		// 'D' ���� 'F' �ſ����
		String text = "";
		switch(grade) {
		case 'A': text = "�ſ���"; break;
		case 'B': text = "���"; break;
		case 'C': text = "����"; break;
		case 'D': text = "����"; break;
		case 'F': text = "�ſ����"; break;
		}
		
	}
}
