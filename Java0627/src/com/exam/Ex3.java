package com.exam;

public class Ex3 {
	public static void main(String[] args) {
		// �⺻ �ڷ�������
		// Ÿ��(�ڷ���) ��ȯ
		// -> ��ȣ ȣȯ���� �������� ����ȯ�� ������
			// -> ������(������, �Ǽ���)
		// ������ ������ 
		long l;
		l = 10;
		System.out.println("l= " + l);
		
		double a;
		a = 7;
		
		long lNum = 27; // 8����Ʈ ũ��
		float fNum; // 4����Ʈ ũ��
		// ������ �Ǽ������� ����Ʈ ũ�⿡ ������� �Ǽ��� �׻� ŭ
		fNum = lNum;
		System.out.println("fNum = " + fNum);
		
		long lNum2;
		float fNum2 = 3.14f;
		
		lNum2 = (long) fNum2; // ����(����) = �Ǽ�(ŭ)
		// ���� ����ȯ ����� ��
		System.out.println("lNum2 = " + lNum2);
		
		char ch = 'A'; //65
		
		System.out.printf("%c => %d\n", ch, (int)ch);
		
		
	}
}
