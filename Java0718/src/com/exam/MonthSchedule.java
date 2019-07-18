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
		if(work == null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
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
		System.out.print("��¥(1~"+this.n + ")?");
		this.i = scanner.nextInt();
		System.out.print("����(��ĭ�����Է�)?");
		String work = scanner.next();
		d[i-1] = new Day();
		d[i-1].set(work);
	}
	void view() {
		System.out.print("��¥(1~"+this.n + ")?");
		this.i = scanner.nextInt();
		System.out.println();
		System.out.print(i + "���� ������ ");
		d[i-1].show();
	}
	void finish(){
		System.out.println("���α׷��� �����մϴ�.");
	}
	void run() {
		while(true) {
			System.out.println("�̹��� ������ ���� ���α׷�.");
			System.out.println("����(�Է�:1, ����:2, ������:3) >> ");
			this.inputNumber = scanner.nextInt();

			if(inputNumber == 1) {
				input();
			}else if(inputNumber == 2) {
				view();
			}else if(inputNumber == 3) {
				finish();
				break;
			}else System.out.println("�ٽ� �Է�");
		}

	}
	public static void main(String[] args) {		MonthSchedule aprill = new MonthSchedule(30);
		aprill.run();
	}
}
