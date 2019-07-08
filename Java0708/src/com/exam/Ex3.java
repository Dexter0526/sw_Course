package com.exam;

public class Ex3 {
	public static void main(String[] args) {
		// Ёвюсец
		aa:
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 2) break aa;
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
