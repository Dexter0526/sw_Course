package com.exam;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex1 {

	public static void main(String[] args) {
		// 자바 IO 데이터 종류
		
		// 바이트 스트림 : 이미지 파일같은 바이너리 위주의 데이터 입출력
		//  InputStream - FileInputStream
		//  OutputStream - FileOutputStream
		
		// 문자 스트림 : 입출력을 char처리, 텍스트 위주의 데이터 입출력
		//  Reader - InputStreamReader, BufferedReader, FileReader 
		//  Writer - OutputStreamWriter, BufferedWriter, FileWriter
		
		// FileReader로 텍스트 파일 읽기
		FileReader reader = null;
		
		try {
			reader = new FileReader("C:/Windows/system.ini");
			
			int c;
			while ((c = reader.read()) != -1) {
				System.out.print((char) c);
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
		
	}// main method

}
