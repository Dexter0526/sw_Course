package com.exam;

import java.util.Arrays;

public class Ex4 {
	public static void main(String[] args) {
		// 자료형 [][] 배열변수이름;
		int[][] a = new int[5][3];	// 5행 3열

		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = 10*j+(i+50);
			}
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("=====================");

		int[][] b = {{10, 20}, {30, 40}, {50, 60}};
		System.out.println("b.length : " + b.length);
		System.out.println("b[0].length : " + b[0].length);
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				System.out.print(b[i][j] + "\t");
			}System.out.println();
		}
	}
}
