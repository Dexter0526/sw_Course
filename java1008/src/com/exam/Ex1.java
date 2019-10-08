package com.exam;

import java.net.URL;

import java.net.MalformedURLException;

public class Ex1 {
	public static void main(String[] args) {
		// File 클래스 : 파일정보 가져올때 주로 사용
		// URL 클래스 : 인터넷상의 주소에 해당하는 자원 정보 가져올때 사용
		
		URL naverNews = null;
		URL itNews = null;
		
		try {
			// 절대 경로로 URL객체 생성
			naverNews = new URL("https://news.naver.com");
			// 상대 경로로 URL 객체 생성
			itNews = new URL(naverNews, "main/main.nhn?mode=LSD&mid=shm&sid1=105");
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		System.out.println("protocol : " + itNews.getProtocol());
		System.out.println("host : " + itNews.getHost());
		System.out.println("port : " + itNews.getPort());
		System.out.println("path : " + itNews.getPath());
		System.out.println("filename : " + itNews.getFile());
		
	}
}
