package com.exam;

public class Ex2 {
	public static void main(String[] args) {
		// ���� ������ + - (��ȣ) ++ -- (����) !(not)
		// �������� ++ 1���� -- 1����
		
		int a = 0;
		a = a + 1;
		System.out.println("a = " + a);
		
		--a;
		System.out.println("a = " + a);
		++a;
		System.out.println("a = " + a);
		
		a = 0;
		int b = 0;
		
		System.out.println("++a : " + ++a);
		System.out.println("b++ : " + b++);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		a = 0;
		b = 0;
		int sum = 0;
		sum = ++a + ++b;
		System.out.println("����ó��");
		System.out.println("sum = " + sum);
		
		a = 0; b = 0; sum = 0;
		sum = a++ + b++;
		System.out.println("����ó��");
		System.out.println("sum = " + sum);
		
	}
}
