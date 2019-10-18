package com.exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {

	public static void main(String[] args) {
		// 키보드 입력스트림 객체 준비
		Scanner scanner = new Scanner(System.in);
		
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			// 서버소켓 생성
			serverSocket = new ServerSocket(9999);
			System.out.println("클라이언트 연결 대기중...");
			// 클라이언트의 접속 대기
			socket = serverSocket.accept();
			System.out.println("연결되었습니다.");
			
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
			
			while (true) {
				// 클라이언트로부터 한행 읽기
				String line = reader.readLine();
				if (line.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 bye로 연결 종료함");
					break;
				}
				System.out.println("클라이언트: " + line);
				System.out.print("보내기>> "); // 입력 프롬프트 띄우기
				String outMessage = scanner.nextLine(); // nextLine()은 \n 제외하고 문자열 리턴함
				writer.write(outMessage + "\n");
				writer.flush(); // 출력버퍼 비워서 문자열 전송
			} // while
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (scanner != null) {
					scanner.close();
				}
				if (socket != null && !socket.isClosed()) {
					socket.close();
				}
				if (serverSocket != null && !serverSocket.isClosed()) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // main method

}
