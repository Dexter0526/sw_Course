package com.exam;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6 {

	public static void main(String[] args) {
		// byte입력스트림 -> char입력스트림 변환 -> 버퍼 처리
		
		BufferedReader reader = null;
				
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\it\\Downloads\\dataset\\test.txt"), "utf-8"));
			
			String line = "";
			
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close(); // IO 객체 자원닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	} // main method

}
