package com.exam;

class StaticTest{
	// Ŭ�������� �ʵ�. Ŭ��������. ��������.
	// Ŭ�������� �Ѱ��� ���� ->
	static int a = 3;
	static int b = 2;
	
}

public class Ex1 {
	public static void main(String[] args) {
		// static : ���� ������ static final
		// ��ü �������� �ٷ� �ʵ� �Ǵ� �޼ҵ忡 ����
		// Ŭ����(static) �ʵ�, Ŭ����(static) �޼ҵ�
		System.out.println(StaticTest.a);
		System.out.println(StaticTest.b);
	}
}
