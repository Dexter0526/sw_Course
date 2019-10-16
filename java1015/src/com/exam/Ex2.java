package com.exam;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;

public class Ex2 {
	public static void main(String[] args) {
		// 첨부파일과 함께 텍스트 이메일 보내기 - MultipartEmail 클래스

		long beginTime = System.currentTimeMillis();

		// 첨부파일 생성을 위한
		EmailAttachment attachment = new EmailAttachment();
		// setName 확장자명 표시(네이버만)
		attachment.setName("첨부1.jpg");
		attachment.setDescription("");	//이미지 설명
		// 경로에 한글 포함 X
		attachment.setPath("");	// 이미지 상대 or 절대 경로

		// MultiPartEmail 객체 생성
		MultiPartEmail email = new MultiPartEmail();
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
			// email.addCc("이메일", "받는 사람 이름", "utf-8");
			// 받는사람(숨은 참조인) 설정
			// email.addBcc("이메일", "받는 사람 이름", "utf-8");

			// 제목 설정
			email.setSubject("메일 제목");
			// 본문 설정
			email.setMsg("메일 본문");
			// 첨부파일 추가
			email.attach(attachment);


			// 메일 전송
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
