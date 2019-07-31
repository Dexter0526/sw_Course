package com.exam;

class StaticTest{
	// 클래스단위 필드. 클래스변수. 정적변수.
	// 클래스마다 한개씩 가짐 ->
	static int a = 3;
	static int b = 2;
	
}

public class Ex1 {
	public static void main(String[] args) {
		// static : 접근 지정자 static final
		// 객체 생성없이 바로 필드 또느 메소드에 접근
		// 클래스(static) 필드, 클래스(static) 메소드
		System.out.println(StaticTest.a);
		System.out.println(StaticTest.b);
	}
}
