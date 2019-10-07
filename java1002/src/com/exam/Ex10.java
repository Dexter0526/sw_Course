package com.exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex10 {

	public static void main(String[] args) {
		// 읽을 파일객체 준비
		File srcFile = new File("C:/Users/it/DownLoads/dataset/test.txt");
		// 쓸 파일객체 준비
		File destFile = new File("C:/Users/it/DownLoads/dataset/한글.txt");
		
		if (!srcFile.exists()) {
			System.out.println("읽을 파일이 없습니다.");
			return;
		}
		
		
		// 입력스트림 준비 - FileReader
		BufferedReader reader = null;
		
		// 출력스트림 준비 - FileWriter
		FileWriter writer = null;
		
		
		
		try {
			// 입력스트림 객체 준비
			reader = new BufferedReader(new FileReader(srcFile));
			// 출력스트림 객체준비
			writer = new FileWriter(destFile);
			
			String line = "";
			while((line = reader.readLine()) != null) {
				writer.write(line);
				writer.write("\r\n"); // 줄바꿈문자 쓰기
			}
			System.out.println(srcFile.getPath() + "를 "
					+ destFile.getPath() + "로 복사하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
		
		
	} // main method

}
