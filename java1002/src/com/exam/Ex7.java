package com.exam;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex7 {

	public static void main(String[] args) {
		System.out.println("데이터 입력하세요.");
		
		// 입력스트림 - 키보드 입력
		BufferedReader reader = null;
		
		// 출력스트림 - 파일 출력
		FileWriter writer = null; // 출력스트림은 기본적으로 버퍼가 있음.
		
		
		// 입력스트림 객체 준비
		reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// 출력스트림 객체 준비
			writer = new FileWriter("C:\\Users\\it\\Downloads\\dataset\\outtest.txt", true);
			
			while (true) {
				String line = reader.readLine(); // 키보드 한줄입력
				if (line.length() == 0) { // line.equals(":q")
					break;
				}
				writer.write(line + "\r\n"); // 지정 파일에 쓰기
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // main method

}
