package com.exam;


// 클래스 TV
//  필드 정수형 channel
//  메소드 void channelUp() -> channel 1 증가
//  메소드 void channelDown() -> channel 1 감소
class TV {
	int channel;
	
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
// 클래스 CaptionTV(자막기능TV) 상속 TV
//  필드 boolean caption 자막상태
//  메소드 void displayCaption() -> "자막상태: true/false"
class CaptionTV extends TV {
	boolean caption;
	
	void displayCaption() {
		System.out.println("자막상태: " + caption);
	}
}

public class Ex1 {
	public static void main(String[] args) {
		// CaptionTV 객체생성
		CaptionTV captionTV = new CaptionTV();
		// 메소드호출 channelUp()
		captionTV.channelUp();
		// channel 필드 값 출력
		System.out.println(captionTV.channel);
		// 메소드호출 displayCaption()
		captionTV.displayCaption();
	} // main method

}
