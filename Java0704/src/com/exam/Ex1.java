package com.exam;

public class Ex1 {
	public static void main(String[] args) {
		// while 반복문
		/*
		초기식;
		while(조건식) {
			반복실행할문장;
			증감식;
		}
		*/
		
		// 1~10 출력
		int i = 1;
		while(i <= 10) {
			System.out.println("i = " + i);
			i++;
		}

		// break문 : 가장 가까운 반복문 블록을 빠져나옴
		for(int j = 1; j <= 10; j++) {
			if (j == 8) continue;
			System.out.println("j = " + j);
		}
		
		// do-while문 : 첫번째 반복은 수행이 보장되는
		/*
		do {
			반복실행할문장;
		}while(조건식);
		*/
		
		boolean isHomeworkFinished = true;
		i = 0;
		do {
			if(i == 3) break;
			System.out.println("맞자~!");
			i++;
		}while(isHomeworkFinished); 
		
	}
}
