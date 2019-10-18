package com.exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientEx {

	public static void main(String[] args) {
		// 키보드 입력스트림 객체 준비
		Scanner scanner = new Scanner(System.in);

		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		Socket socket = null;
		
		try {
			socket = new Socket("localhost", 9999); // 서버에 접속
			
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
			
			while (true) {
				System.out.print("보내기>> ");
				String line = scanner.nextLine();
				// 키보드 입력값 서버로 전송
				writer.write(line + "\n");
				writer.flush();
				// 서버로 bye를 전송했으면 빠져나와 채팅 종료
				if (line.equalsIgnoreCase("bye")) {
					break;
				}
				
				// 서버로부터 받은 메시지 출력
				String inputMessage = reader.readLine();
				System.out.println("서버: " + inputMessage);
				
			} // while
			
		} catch (Exception e) {
			e.printStackTrace();
		}  finally {
			try {
				if (scanner != null) {
					scanner.close();
				}
				if (socket != null && !socket.isClosed()) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	} // main method

}
