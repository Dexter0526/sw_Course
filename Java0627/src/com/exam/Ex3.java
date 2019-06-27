package com.exam;

public class Ex3 {
	public static void main(String[] args) {
		// 기본 자료형에서
		// 타입(자료형) 변환
		// -> 상호 호환관계 내에서는 형변환이 가능함
			// -> 숫자형(정수형, 실수형)
		// 정수형 내에서 
		long l;
		l = 10;
		System.out.println("l= " + l);
		
		double a;
		a = 7;
		
		long lNum = 27; // 8바이트 크기
		float fNum; // 4바이트 크기
		// 정수와 실수간에는 바이트 크기에 상관없이 실수가 항상 큼
		fNum = lNum;
		System.out.println("fNum = " + fNum);
		
		long lNum2;
		float fNum2 = 3.14f;
		
		lNum2 = (long) fNum2; // 정수(작음) = 실수(큼)
		// 수동 형변환 해줘야 함
		System.out.println("lNum2 = " + lNum2);
		
		char ch = 'A'; //65
		
		System.out.printf("%c => %d\n", ch, (int)ch);
		
		
	}
}
