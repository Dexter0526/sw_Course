package com.exam;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex8 {

	public static void main(String[] args) {
		// 키보드 입력으로 아이디, 패스워드, 이름 값 받아서
		// 지정 경로에 파일(test2.txt)로 출력하기
		
		BufferedReader reader = null;
		FileWriter writer = null;
		
		// 입력스트림 객체 준비
		reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// 출력스트림 객체 준비
			writer = new FileWriter("C:\\Users\\it\\Downloads\\dataset\\outtest2.txt");
			
			// 입력받기
			System.out.print("아이디: ");
			String id = reader.readLine();
			
			System.out.print("패스워드: ");
			String passwd = reader.readLine();
			
			System.out.print("이름: ");
			String name = reader.readLine();
			
			
			// 출력하기 (줄바꿈문자 "\r\n" 유의)
			writer.write(id + "\r\n");
			writer.write(passwd + "\r\n");
			writer.write(name + "\r\n");
			
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
