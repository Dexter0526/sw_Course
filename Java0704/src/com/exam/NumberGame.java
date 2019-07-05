package com.exam;

import java.awt.Toolkit;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 숫자 맞추기 게임
		// 1단계 : 6, 7, 8, 9 중 임의의 정수를 생성함. 
		// -생선된 정수를 사람이 맞추는 게임.
		// 
		// 2단계 : 짝수인지 홀수인지 힌트주기
		// -짝수면 "짝수입니다"
		// -홀수면 "홀수입니다"

		// 3단계 : 사용자 입력 숫자값 받기

		// 4단계 : 사용자 입력값과 컴퓨터값을 비교
		//
		// Math.random()*4+3;


		int com;
		int user;
		// 1단계
		com = (int) (Math.random()*4+6);

		// 2단계
		if(com % 2 == 0) System.out.println("짝수입니다");
		else System.out.println("홀수입니다");

		// 3단계
		System.out.print("숫자를 입력하셰요 : ");
		user = sc.nextInt();

		// 4단계
		if(user == com) System.out.println("맞췄습니다");
		else System.out.println("실패...");
		System.out.println("입력값 : " + user + 
				", 컴퓨터값 : " + com);

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		toolkit.beep(); // 비프음 소리 출력

		/*
		 * 1, 2, 3 중 임의의 정수 총 3개 생성
		 * 숫자 3개가 모드 같으면 잭팟~!
		 * 다르면 금액을 잃는...
		 * 
		 */


		// 숫자 맞추기 게임
		// 1단계 : 1~100 중 임의의 정수를 생성함. 
		// -생선된 정수를 사람이 맞추는 게임.
		// 
		// 2단계 : 짝수인지 홀수인지 힌트주기
		// -짝수면 "짝수입니다"
		// -홀수면 "홀수입니다"

		// 3단계 : 사용자 입력 숫자값 받기
		// 입력받는 숫자가 1~100사이가 아닐경우 재입력

		// 4단계 : 사용자 입력값과 컴퓨터값을 비교
		// -비교 if 사용자값 > 컴퓨터값(맞춰야될값)
		// 		-> "더 작은값 입력하세요"
		// -비교 if 사용자값 < 컴퓨터값(맞춰야될값)
		// 		-> "더 큰값 입력하세요"
		// -비교 if 사용자값 = 컴퓨터값(맞춰야될값)
		// 		-> "맞췄습니다."
		//			"시도횟수 : x"

		// Math.random()*100;
		
		com = (int) (Math.random()*100+1);
		int count = 0;
		System.out.println(com);

		// 2단계
		if(com % 2 == 0) System.out.println("짝수입니다");
		else System.out.println("홀수입니다");

		// 3단계
		while(true) {
			System.out.print("숫자를 입력하셰요 : ");
			user = sc.nextInt();
			count++;
			if(user < 1 || user > 100) {
				System.out.print("숫자를 재입력하셰요 : ");
				user = sc.nextInt();
				count++;
			}
			// 4단계
			else {
				if(user == com) {
					System.out.println("맞췄습니다");
					System.out.println("시도횟수 : " + count);
					break;
				}else if(user > com) {
					System.out.println("더 작은값 입력하세요");
				}else if(user < com) {
					System.out.println("더 큰값 입력하세요");
				}

			}
		}

		sc.close();
	}
}
