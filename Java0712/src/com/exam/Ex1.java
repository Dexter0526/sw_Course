package com.exam;

// Ŭ���� ���� Book
// å ���� ���ڿ� title
// å ���� ������ price
// å ���� ������ num

// å�ݾ����� �޼ҵ�
// ������ ���� sum()

class Book{
	String title;
	int price;
	int num;

	int sum(String title, int price, int num) {
		int sum = 0;
		
		sum = price * num;
		return sum;
	}
		
	void print() {
		int sum = sum(title, price, num);
		System.out.println("å ���� : " + title 
				+ " ���� : " + price 
				+ " ���� : " + num);
		System.out.println("å�ݾ��հ� : " + sum);
	}
}

public class Ex1 {
	
	public static void main(String[] args) {
		// Book ���
		
		// ��� : "å ���� : java ���� : 1000 ���� : 30
		//		"å�ݾ��հ� : 30000
		
		Book book = new Book();
		
		book.title = "java";
		book.price = 1000;
		book.num = 30;
		book.print();
		
	}
}
