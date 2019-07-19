package com.exam;

import java.util.Scanner;

public class View {
	int number;
	String name;
	int index;
	Scanner scanner = new Scanner(System.in);
	Seat seat = new Seat();
	
	void reservation() {
		System.out.println("좌석구분 S(1), A(2), B(3)>>");
		this.number = scanner.nextInt();
		if(number == 1) {
			System.out.print("S>>");
			for(int i = 0; i < seat.s.length; i++) {
				System.out.print(seat.s[i] + " ");
			}System.out.println();
			System.out.print("이름>>");
			this.name = scanner.next();
			System.out.println();
			System.out.print("번호>>");
			this.index = scanner.nextInt();
			System.out.println();
			seat.s[index-1] = name;
		}else if(number == 2) {
			System.out.print("A>>");
			for(int i = 0; i < seat.a.length; i++) {
				System.out.print(seat.a[i] + " ");
			}System.out.println();
			System.out.print("이름>>");
			this.name = scanner.next();
			System.out.println();
			System.out.print("번호>>");
			this.index = scanner.nextInt();
			System.out.println();
			seat.a[index-1] = name;
		}else if(number == 3) {
			System.out.print("B>>");
			for(int i = 0; i < seat.b.length; i++) {
				System.out.print(seat.b[i] + " ");
			}System.out.println();
			System.out.print("이름>>");
			this.name = scanner.next();
			System.out.println();
			System.out.print("번호>>");
			this.index = scanner.nextInt();
			System.out.println();
			seat.b[index-1] = name;
		}
	}
	void show() {
		seat.show();
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	void cancel() {
		System.out.println("좌석 S:1, A:2, B:3>> ");
		this.number = scanner.nextInt();
		if(number == 1) {
			System.out.print("S>>");
			for(int i = 0; i < seat.s.length; i++) {
				System.out.print(seat.s[i] + " ");
			}System.out.println();
			System.out.print("이름>>");
			this.name = scanner.next();
			for(int i = 0; i < seat.s.length; i++) {
				if(seat.s[i].equals(this.name)) {
					seat.s[i] = "---";
					break;
				}
			}
		}else if(number == 2) {
			System.out.print("A>>");
			for(int i = 0; i < seat.a.length; i++) {
				System.out.print(seat.a[i] + " ");
			}System.out.println();
			System.out.print("이름>>");
			this.name = scanner.next();
			for(int i = 0; i < seat.a.length; i++) {
				if(seat.a[i].equals(this.name)) {
					seat.a[i] = "---";
					break;
				}
			}
		}else if(number == 3) {
			System.out.print("B>>");
			for(int i = 0; i < seat.b.length; i++) {
				System.out.print(seat.b[i] + " ");
			}System.out.println();
			System.out.print("이름>>");
			this.name = scanner.next();
			for(int i = 0; i < seat.b.length; i++) {
				if(seat.b[i].equals(this.name)) {
					seat.b[i] = "---";
					break;
				}
			}
		}
	}
	
	void run() {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		while(true) {
			System.out.println("예약: 1, 조회: 2, 취소: 3, 끝내기: 4 >>");
			number = scanner.nextInt();
			
			if(number == 1) {
				reservation();
			}else if(number == 2) {
				show();
			}else if(number == 3) {
				cancel();
			}else {
				System.out.println("종료");
				break;
			}
		}
	}
}
