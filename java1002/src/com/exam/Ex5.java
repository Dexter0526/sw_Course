package com.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Ex5 {

	public static void main(String[] args) {
		// byte입력스트림 -> char입력스트림 변환 처리
		
		InputStreamReader reader = null;
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\it\\Downloads\\dataset\\test.txt");
			reader = new InputStreamReader(fis, "utf-8");
			
			int c;
			System.out.println("인코딩 문자 집합은: " + reader.getEncoding());
			while ((c = reader.read()) != -1) {
				System.out.print((char) c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	} // main method

}
