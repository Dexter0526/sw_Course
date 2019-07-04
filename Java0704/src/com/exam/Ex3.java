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
		
	}
}
