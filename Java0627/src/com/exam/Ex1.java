package com.exam;

public class Ex1 {
	public static void main(String[] args) {
		char ch;
		ch = 'A'; // 작은따옴표로 문자 한개 표현
		
		boolean f;
		f = true;
		f = false;
		System.out.println(f);
		
		System.out.println(5 + 'A' + "문자열" + 3);
		
		int g;
		//System.out.println(g);
		// 초기화 되지 않으면 사용 못함
		// h = 10;
		
		int count = 5;
		count = count - 2;
		count = count + 10;
		System.out.println("연필이 \t필통에 " + count + "자루가 있다");
		
		// 실수형 변수 pi 선언, 3.14값 저장
		double pi;
		pi = 3.14;
		// 정수형 변수 r 선언, 4 값 저장(반지름)
		
		int r;
		r = 4;
		// 실수형 변수 area 선언, r*r*pi 수식 계산결과 저장(면적)
		double area;
		area = r*r*pi;
		// 콘솔출력
		// "반지름"이 ..인
		// 		\원의면적\은 ..이다.
		System.out.println("\"반지름\"이 : " + r +"\t\\원의 면적은\\ : "+area);
		
		// 출력 특수문자 리터럴(이스케이프 문자)
		// \" \' \\ \n
	}
}
