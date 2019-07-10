package com.exam;

public class Ex3 {

	public static int calc(char a, int b, int c) {
		int answer = 0;

		switch (a) {
		case '+': answer = b + c;
			break;
		case '-': answer = b - c;
			break;
		case '*': answer = b * c;
			break;
		case '/': answer = b / c;
			break;
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println("20 + 10 = " + calc('+', 20, 10));
		System.out.println("20 - 10 = " + calc('-', 20, 10));
		System.out.println("20 * 10 = " + calc('*', 20, 10));
		System.out.println("20 / 10 = " + calc('/', 20, 10));
	}
}
