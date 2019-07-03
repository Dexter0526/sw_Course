package com.exam;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Math 클래스의 random() 메소드 이용해서
		// 임의의 정수 만들기

		/*
		 * Math.random() 메소드 호출하면
		 * 0.0~1.0 임의의 실수가 나옴
		 * 0~0.99999	Math.random()
		 * 0.0~2.00		(Math.random()*3)
		 * 0~2			(int)(Math.random()*3)
		 * 1~3			(int)(Math.random()*3)+1
		 */
		int num = (int)(Math.random()*3)+1;
		String com = "";
		switch (num) {
		case 1: com = "가위";		
		break;
		case 2: com = "바위";		
		break;
		case 3: com = "보";		
		break;
		}

		System.out.println("가위바위보 게임입니다. ");
		System.out.println("가위, 바위, 보 중에서 입력하세요.");
		System.out.print("사용자 >> ");
		String user = sc.nextLine();
		System.out.println("컴퓨터 >> " + com);
		String answer = "";

		if(user.equals("가위")) {
			if(com.equals("가위")) {
				answer = "Draw";
			}else if(com.equals("바위")){
				answer = "Lose";
			}else {
				answer = "Win";
			}
		}else if(user.equals("바위")) {
			if(com.equals("가위")) {
				answer = "Win";
			}else if(com.equals("바위")){
				answer = "Draw";
			}else {
				answer = "Lose";
			}
		}else {
			if(com.equals("가위")) {
				answer = "Lose";
			}else if(com.equals("바위")){
				answer = "Win";
			}else {
				answer = "Draw";
			}
		}
		System.out.println("결과 : " + answer);
		sc.close();

	}
}