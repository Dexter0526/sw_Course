package com.exam;

public class Student {
	// 학번 정수형 hakbun
	int hakbun;
	// 학생일름 문자열 name
	String name;
	// 국어점수 정수형 kor
	int kor;
	// 영어점수 정수형 eng
	int eng;
	// 수학점수 정수형 math
	int math;
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("Student 생성자 호출됨.");
		kor = (int) (Math.random()*41) + 60;
		eng = (int) (Math.random()*41) + 60;
		math = (int) (Math.random()*41) + 60;
		
	}
	public Student(int hakbun, String name, int kor, int eng, int math) {
		super();
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	// 합계 구하는 메소드
	// sum return;
	int sum() {
		int sum = kor + eng + math;
		return sum;
	}
	// 평균 구하는 메소드
	// avg return;
	double avg() {
		int sum = 0;
		sum = sum();
		double avg = (double)sum / 3;
		
		return Math.round(avg*100)/100.0;
	}
}
