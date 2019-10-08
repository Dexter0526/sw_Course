package com.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Ex2 {
	public static void main(String[] args) {
		// URL 객체로부터 바이트 입력스트림을 가져오기
		
		BufferedReader reader = null;
		
		try {
			URL url = new URL("https://www.naver.com");
			// openStream() : URL주소와 연결하여 입력받을수 있게하는 InputStream 객체 리턴
			InputStream is = url.openStream();
			
			reader = new BufferedReader(new InputStreamReader(is, "utf-8"));
			
			String line = "";
			
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
