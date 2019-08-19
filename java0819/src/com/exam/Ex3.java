package com.exam;

public class Ex3 {
	public static int methodA() {
		try {
			String str = "문자열";
			System.out.println("문자열 개수 : "+ str.length());
			return 10;
		}finally {
			System.out.println("정리작업수행");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("=====프로그램 시작=====");
		System.out.println(methodA());
		System.out.println("=====프로그램 종료=====");
	}
}
