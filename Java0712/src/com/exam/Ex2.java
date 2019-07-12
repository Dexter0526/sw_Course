package com.exam;

public class Ex2 {

	public static void main(String[] args) {
		int channel = 0;
		// 클래스 호출
		Tv tv = new Tv();
		tv.channel = channel;
		// onoff 호출
		tv.powerOnOf();
		// 전원상태값 출력 power
		tv.prinPower();
		// 메소드호출로 채널 1증가
		tv.channelUp();
		// 메소드호출로 채널 1증가
		tv.channelUp();
		// 현재 채널값 출력
		tv.printChannel();
		// 메소드호출로 채널 1감소
		tv.channelDown();
		// 메소드호출로 채널 1증가
		tv.channelUp();
		// 메소드호출로 채널 1감소
		tv.channelDown();
		// 현재 채널값 출력
		tv.printChannel();
		
		
		
	}
}
