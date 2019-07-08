package com.exam;

public class Ex5 {
	public static void main(String[] args) {
		// 2차원배열 정수형 num {1,2}, {3,4}, {5, 6, 7}
		int[][] num = {{1,2}, {3,4}, {5, 6, 7}};
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
			}System.out.println();
		}
		
		// 2차원 배열 문자열 names
		// {"홍길동", "이순신"} {"유관순"}
		String[][] name = {{"홍길동", "이순신"}, {"유관순"}};
		for(int i = 0; i < name.length; i++) {
			for(int j = 0; j < name[i].length; j++) {
				System.out.print(name[i][j] + "\t");
			}System.out.println();
		}
	}
}
