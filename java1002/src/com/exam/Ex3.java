package com.exam;

import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) {
		// 표준입출력
		// 입력(키보드) - System.in.read()
		// 출력(모니터콘솔) - System.out.println()
		
		System.out.println("데이터 입력 끝내려면 ctrl z(-1)를 입력하세요");
		
		int data = 0;

		try {
			while((data = System.in.read()) != - 1) {
				System.out.println((char)data + " ");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
