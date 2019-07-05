package com.exam;

public class Ex3 {
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {	// 행(row)
			for(int j = 0; j < 5; j++) {	// 열(column)
				System.out.print("*");
			}System.out.println();
		}

		// 시계 (시 0~23, 분 0~59)
		// 0시 0분
		// 0시 1분
		// ...

		for(int i = 0; i < 24; i++) {
			for(int j = 0; j < 60; j++) {
				System.out.println(i + "시 " + j + "분");
			}
		}
		// 2중 for문 이용
		/*
 		  for 출력 * 5x5 출력
 		  
		 */
		/*
		  *
		  **
		  ***
		  ****
		  ....
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		/*
		 * 2*1=2 2*2=4 ....
		 * ....
		 */
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "\t");
			}System.out.println();
		}
	}
}
