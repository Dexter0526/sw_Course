package com.exam;

public class Ex2 {
	public static void main(String[] args) {
		// 2´Ü
		// 2 * 1 = 2
		// 2 * 2 = 4
		// ....
		for(int i = 1; i < 10; i++) {
			System.out.println("2 * " + i + " = " + (2*i));
		}
		
		// 5´Ü
		for(int i = 1; i < 10; i++) {
			System.out.println("5 * " + i + " = " + (5*i));
		}
		
		int f = 0; // È­¾¾ ¿Âµµ
		// ¼·¾¾¿Âµµ (0µµ~100µµ)
		// È­¾¾¿Âµµ = ¼·¾¾¿Âµµ * 9 / 5 + 32
		// Ãâ·Â " ¼·¾¾ ¸îµµ -> È­¾¾ ¸îµµ"
		for(int i = 0; i <= 100; i++) {
			f = (i * 9 / 5) + 32;
			System.out.println("¼·¾¾ : " + i + "µµ -> "+
			"È­¾¾ : " + f + "µµ");
		}
	}
}
