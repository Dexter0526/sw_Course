package com.exam;

public class Ex1 {
	public static void main(String[] args) {
		char ch;
		ch = 'A'; // ��������ǥ�� ���� �Ѱ� ǥ��
		
		boolean f;
		f = true;
		f = false;
		System.out.println(f);
		
		System.out.println(5 + 'A' + "���ڿ�" + 3);
		
		int g;
		//System.out.println(g);
		// �ʱ�ȭ ���� ������ ��� ����
		// h = 10;
		
		int count = 5;
		count = count - 2;
		count = count + 10;
		System.out.println("������ \t���뿡 " + count + "�ڷ簡 �ִ�");
		
		// �Ǽ��� ���� pi ����, 3.14�� ����
		double pi;
		pi = 3.14;
		// ������ ���� r ����, 4 �� ����(������)
		
		int r;
		r = 4;
		// �Ǽ��� ���� area ����, r*r*pi ���� ����� ����(����)
		double area;
		area = r*r*pi;
		// �ܼ����
		// "������"�� ..��
		// 		\���Ǹ���\�� ..�̴�.
		System.out.println("\"������\"�� : " + r +"\t\\���� ������\\ : "+area);
		
		// ��� Ư������ ���ͷ�(�̽������� ����)
		// \" \' \\ \n
	}
}
