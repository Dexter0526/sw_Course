package com.exam;

import java.io.File;

import org.apache.commons.mail.HtmlEmail;

public class Ex3 {
	public static void main(String[] args) {
		
		long beginTime = System.currentTimeMillis();
		// HTML 형식으로 메일 보내기
		
		// HtmlEmail 객체 생성
		HtmlEmail email = new HtmlEmail();
		
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		// 관리자 계정
		email.setAuthentication("dexterpark1992@gmail.com", "hhgybhciycanbzyy");

		// SMTP SSL, TLS 설정
		email.setSSLOnConnect(true);
		email.setStartTLSEnabled(true);
		
		// 이메일 내용에 일부로써 배치할 이미 파일객체 준비
		File imgFile = new File("");	// 이미지 경로
		
		String result = "fail";

		try {
			// 보내는 사람 설정
			// 관리자 계정과 동일해야함
			email.setFrom("dexterpark1992@gmail.com", "관리자", "utf-8");
			// 받는 사람 설정
			email.addTo("soul9862@gmail.com", "박정수", "utf-8");
			// 받는사람(참조인) 설정
			// email.addCc("이메일", "받는 사람 이름", "utf-8");
			// 받는사람(숨은 참조인) 설정
			// email.addBcc("이메일", "받는 사람 이름", "utf-8");

			// 제목 설정
			email.setSubject("메일 제목");
			// 본문 설정
			StringBuilder sb= new StringBuilder();
			sb.append("<html>");
			sb.append("<head>");
			sb.append("<meta charset='utf-8'>");
			sb.append("</head>");
			sb.append("<body>");
			sb.append("안녕~ 내 이름은 ooo");
			sb.append("<img src=cid:" + email.embed(imgFile) + "><br>");
			sb.append("만나서 반강워~");
			sb.append("</body>");

			email.setCharset("utf-8");
			email.setHtmlMsg(sb.toString());
			
			result = email.send();
		} catch (Exception e) {
			e.printStackTrace();
		}

		long endTime = System.currentTimeMillis();
		long execTime = endTime - beginTime;

		System.out.println(result);
		System.out.println(execTime);
	}
}
