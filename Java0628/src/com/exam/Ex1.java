package com.exam;

public class Ex1 {
	public static void main(String[] args) {
		/*
		 * 연산자 왼쪽 -> 오른쪽  우선순위  괄호()
		 * 변수 = 수식
		 * 1. 단항연산자 + - 부호  ++ --(증감)  !(not)  (형변환)
		 * 2. 산술연산자 *  / %  +  -
		 * 3. 비교연산자 > < >= <= == !=
		 * 4. 논리연산자 && (and)  || (or)
		 * 5. 삼항(조건)연산자 변수 = 조건식 ? 참값 : 거짓값;
		 * 6. 대입연산자 =  +=  -=  *=  /=  %=
		 */
		
		// 정수형끼리 연산할때는 바이트크기 기주으로 큰쪽으로
		// 맞춘뒤에 연산이 수행됨
		
		int a = 5, b = 2;
		// 5/2 -> 2
		System.out.println("정수형 나눗셈 결과 : " + a/b);
		// 실수형 
		System.out.println("실수형 나눗셈 결과: "+ (double)a/b);
		
		// 나머지 연산은 정수형 나눗셈일때만 의미있는 결과가 나옴
		System.out.println("나눗셈 나머지 결과: "+ a%b);
		
		// + 연산자는 두가지 기능 있음
		// 1) 덧셈   2)문자열 연결
		System.out.println();
		
		byte c = 10;
		byte d = 20;
		byte sum = (byte) (c + d);
		System.out.println("sum = " + sum);
		
		int e = 1_000_000;
		int f = 2_000_000;
		long g = e * f; // int 형  * int 형 -> int 형 결과

		
	}
}
