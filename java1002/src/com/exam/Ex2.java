package com.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex2 {

	public static void main(String[] args) {
		
		// FileReader로 텍스트 파일 읽기
		// BufferedReader로 사용
		
		BufferedReader reader = null;
		 

		try {
			reader 
				= new BufferedReader(
						new FileReader("C:/Windows/system.ini"));
			// BufferedReader는
			// 줄바꿈문자까지 하나의 스트링문자열로 읽어들임.
			// 줄바꿈문자는 리턴문자열에 포함하지 않음.
			String line;
			
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close(); // 입출력 객체 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // main method

}
