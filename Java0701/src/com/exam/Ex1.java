package com.exam;

public class Ex1 {
	public static void main(String[] args) {
		// �������� && (and)  || (or)  !(not)
		// -> �񱳿����ڰ� ����� ������ ������� ������ ���� ���Ǵ��� �ϴ� ������

		int a = 10, b = 20;

		System.out.println("!true = " + !true);
		System.out.println("a > b = " + (a > b));

		// && (and)  �׸���, ~�̰�
		// true && true

		System.out.println(a < b && a != b);
		System.out.println(a < b && a == b);
		System.out.println(a > b && a != b);
		System.out.println(a > b && a == b);

		// || (or)  �Ǵ�, ~�̰ų�
		System.out.println(a < b || a != b);
		System.out.println(a < b || a == b);
		System.out.println(a > b || a != b);
		System.out.println(a > b || a == b);

		int age = 15;
		String str = "";
		// 10~19  10 <= age <= 19
		//	10 <= age && age <= 19

		str = (10<=age && age<=19) ? "10��" : "10�� �ƴ�";

		System.out.println(age + "�� -> " + str);
		
		int jumin = 1; // 1�� 2�� 3�� 4��
		str = (jumin == 2 || jumin == 4) ? "��" : "��";
		System.out.println(jumin + " -> " + str);
		
		int kor = 85, eng = 80, math = 40;
		int sum = 0; // �հ�
		double avg = 0; //���
		// ��� ���� : ���� : ���� : 
		//    �հ� : ��� : 
		
		// ����� 60�� �̻��̰� �� ������ ��� 40�� �̻��̸�
		// "�հ�" �ƴϸ� "���հ�"
		
		sum = kor + eng + math;
		avg = sum/3;
		
		str = (avg >= 60 && kor >= 40 && eng >= 40 && math >= 40) ? "�հ�" : "���հ�";
		System.out.println("���� : " + kor + "\t\t���� : " + eng + "\t\t���� : " + math);
		System.out.println("�հ� : " + sum + "\t��� : " + avg);
		System.out.println("��� : " + str);

	}
}

