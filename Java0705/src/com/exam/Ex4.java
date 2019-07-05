package com.exam;

public class Ex4 {
	public static void main(String[] args) {
		// 배열 : 같은 자료형의 기억장소를 여러개 사용
		// 배열은 객체이다.
		
		int [] a; // 정수형 배열을 참조하는 참조변수
		a = new int[5]; // 배열객체 생성 -> 객체는 기본값으로 초기화됨
		for(int i = 0; i <= 4; i++) {
			a[i] = i;
			System.out.println("a[" + i + "] = " + a[i]);
		}
		int[] c = {1,2,3,4,5};	// 상속개념
//		c = {10,20,30}; 오류 발생
		int[] d = new int[] {10,20,30,40,50};
		d = new int[] {1,2,3};
		
		
		// 실수형 배열 선언 dArr 크기 : 4
		double[] dArr = new double[4];
		dArr[0] = 3.14;
		dArr = new double[] {1.1, 2.2, 3.3, 4.4, 5.5};
		for(double dnum : dArr) {
			System.out.println("dnum = " + dnum);
		}
		
		// 문자열 String 배열 선언 strArr 크기 4
		// 인덱스0 "홍길동" 저장
		// 인덱스1 "성춘향" 저장
		// 인덱스2 "이몽룡" 저장
		String[] strArr = new String[4];
		strArr[0] = "홍길동";
		strArr[1] = "성춘향";
		strArr[2] = "이몽룡";
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + "\t");
		}
		System.out.println();
		
		// boolean 형 배열 선언 크기 3
		// true, true, 
		boolean[] boolArr = new boolean[3];
		boolArr[0] = true;
		boolArr[1] = true;
		for(int i = 0; i < boolArr.length; i++) {
			System.out.print(boolArr[i] + "\t");
		}
	} 
	
}
