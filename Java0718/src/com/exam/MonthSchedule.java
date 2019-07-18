package com.exam;

import java.util.Scanner;

class Day{
	private String work;
	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
	}
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}

public class MonthSchedule {
	Scanner scanner = new Scanner(System.in);
	int n;
	int inputNumber;
	int i;
	Day[] d;

	public MonthSchedule() {

	}

	public MonthSchedule(int n) {
		this.n = n;
		this.d = new Day[this.n];
//		for(int i = 0; i < d.length; i++) {
//			d[i] = new Day();
//		}
	}

	void input() {
		System.out.print("날짜(1~"+this.n + ")?");
		this.i = scanner.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String work = scanner.next();
		d[i-1] = new Day();
		d[i-1].set(work);
	}
	void view() {
		System.out.print("날짜(1~"+this.n + ")?");
		this.i = scanner.nextInt();
		System.out.println();
		System.out.print(i + "일의 할일은 ");
		d[i-1].show();
	}
	void finish(){
		System.out.println("프로그램을 종료합니다.");
	}
	void run() {
		while(true) {
			System.out.println("이번달 스케쥴 관리 프로그램.");
			System.out.println("할일(입력:1, 보기:2, 끝내기:3) >> ");
			this.inputNumber = scanner.nextInt();

			if(inputNumber == 1) {
				input();
			}else if(inputNumber == 2) {
				view();
			}else if(inputNumber == 3) {
				finish();
				break;
			}else System.out.println("다시 입력");
		}

	}
	public static void main(String[] args) {		MonthSchedule aprill = new MonthSchedule(30);
		aprill.run();
	}
}
