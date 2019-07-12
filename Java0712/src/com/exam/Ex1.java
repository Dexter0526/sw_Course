package com.exam;

// 클래스 정의 Book
// 책 제목 문자열 title
// 책 가격 정수형 price
// 책 개수 정수형 num

// 책금액총합 메소드
// 정수형 리턴 sum()

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
		System.out.println("책 제목 : " + title 
				+ " 가격 : " + price 
				+ " 재고수 : " + num);
		System.out.println("책금액합계 : " + sum);
	}
}

public class Ex1 {
	
	public static void main(String[] args) {
		// Book 사용
		
		// 출력 : "책 제목 : java 가격 : 1000 재고수 : 30
		//		"책금액합계 : 30000
		
		Book book = new Book();
		
		book.title = "java";
		book.price = 1000;
		book.num = 30;
		book.print();
		
	}
}
