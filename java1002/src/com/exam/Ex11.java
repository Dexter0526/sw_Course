package com.exam;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) {
		// *바이너리 파일 복사하기
		
		// 읽을 파일객체 준비
		File srcFile = new File("C:/Users/it/DownLoads/dataset/temp/1.png");
		// 쓸 파일객체 준비
		File destFile = new File("C:/Users/it/DownLoads/dataset/temp/10.png");
				
		if (!srcFile.exists()) {
			System.out.println("읽을 파일이 없습니다.");
			return;
		}
		
		
		// 입력스트림 준비 - FileReader
		BufferedInputStream is = null;
		
		// 출력스트림 준비 - FileWriter
		FileOutputStream os = null;
		
		
		try {
			// 입력스트림 객체 준비
			is = new BufferedInputStream(new FileInputStream(srcFile));
			// 출력스트림 객체 준비
			os = new FileOutputStream(destFile);
			
			int data = 0;
			while ((data = is.read()) != -1) {
				os.write(data);
				
			}
			
			System.out.println(srcFile.getPath() + "를 " 
					+ destFile.getPath() + "로 복사하였습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close(); // 입력스트림 객체 닫기
				os.close(); // 출력스트림 객체 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	} // main method

}
