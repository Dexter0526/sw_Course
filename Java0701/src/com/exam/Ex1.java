package com.exam;

public class Ex1 {
	public static void main(String[] args) {
		// 논리연산자 && (and)  || (or)  !(not)
		// -> 비교연산자가 적용된 수식의 결과값을 가지고 최종 논리판단을 하는 연산자

		int a = 10, b = 20;

		System.out.println("!true = " + !true);
		System.out.println("a > b = " + (a > b));

		// && (and)  그리고, ~이고
		// true && true

		System.out.println(a < b && a != b);
		System.out.println(a < b && a == b);
		System.out.println(a > b && a != b);
		System.out.println(a > b && a == b);

		// || (or)  또는, ~이거나
		System.out.println(a < b || a != b);
		System.out.println(a < b || a == b);
		System.out.println(a > b || a != b);
		System.out.println(a > b || a == b);

		int age = 15;
		String str = "";
		// 10~19  10 <= age <= 19
		//	10 <= age && age <= 19

		str = (10<=age && age<=19) ? "10대" : "10대 아님";

		System.out.println(age + "세 -> " + str);
		
		int jumin = 1; // 1남 2여 3남 4여
		str = (jumin == 2 || jumin == 4) ? "여" : "남";
		System.out.println(jumin + " -> " + str);
		
		int kor = 85, eng = 80, math = 40;
		int sum = 0; // 합계
		double avg = 0; //평균
		// 출력 국어 : 영어 : 수학 : 
		//    합계 : 평균 : 
		
		// 평균이 60점 이상이고 각 과목이 모두 40점 이상이면
		// "합격" 아니면 "불합격"
		
		sum = kor + eng + math;
		avg = sum/3;
		
		str = (avg >= 60 && kor >= 40 && eng >= 40 && math >= 40) ? "합격" : "불합격";
		System.out.println("국어 : " + kor + "\t\t영어 : " + eng + "\t\t수학 : " + math);
		System.out.println("합계 : " + sum + "\t평균 : " + avg);
		System.out.println("결과 : " + str);

	}
}

