package com.exam;

import org.apache.commons.mail.SimpleEmail;

public class Ex1 {

	public static void main(String[] args) {
		// 메일 전송기능 라이브러리 준비
		
		// SMTP(Send Mail Transfer Protocol) 프로토콜
		
		// JavaMail
		// -> mail-1.4.7.jar
		
		// CommonsEmail
		// -> commons-email-1.5.jar
		
		// JAF(Java Activation Framework)
		// -> activation-1.1.1.jar
		
		// SimpleEmail 클래스 : 텍스트 전송
		
		// MultiPartEmail 클래스 : 메시지와 파일을 함께 전송
		// EmailAttachment 클래스 : 첨부파일 역할
		
		// HtmlEmail 클래스 : 이메일을 HTML 형식으로 전송
		
		// 이메일 전송용 프로토콜인 SMTP를 사용함.
		// SMTP 서버 호스트명(IP주소)
		// smtp.naver.com
		// smtp.daum.net
		// smtp.google.com
		
		// SMTP 서버 포트 : 기본포트 465(SSL) 또는 587(TLS)
		
		// SMTP 서버 계정정보 : 로그인할 아이디, 패스워드
		
		// SimpleEmail 객체 생성
		SimpleEmail email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		// 관리자 계정
		email.setAuthentication("dexterpark1992@gmail.com", "hhgybhciycanbzyy");
		
		// SMTP SSL, TLS 설정
		email.setSSLOnConnect(true);
		email.setStartTLSEnabled(true);
		
		String result = "fail";
		
		try {
			// 보내는 사람 설정
			// 관리자 계정과 동일해야함
			email.setFrom("dexterpark1992@gmail.com", "관리자", "utf-8");
			// 받는 사람 설정
			email.addTo("soul9862@gmail.com", "박정수", "utf-8");
			// 받는사람(참조인) 설정
//			email.addCc("이메일", "받는 사람 이름", "utf-8");
			// 받는사람(숨은 참조인) 설정
//			email.addBcc("이메일", "받는 사람 이름", "utf-8");
			
			// 제목 설정
			email.setSubject("메일 제목");
			// 본문 설정
			email.setMsg("메일 본문");
			
			// 메일 전송
			result = email.send();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("result : " + result);
		
		
	} // main method

}
