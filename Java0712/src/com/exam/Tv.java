package com.exam;

public class Tv {
	// 필드(멤버변수)
	// 전원 bool형 power
	// 채널 정수형 channel
	// 

	// 메소드
	// 전원 켜고 끄기 power on or off

	// 채널1증가 channelUp()
	// 채널1다운 channelDown()
	
	Tv(){
		System.out.println("Tv 생성자 호출됨.");
		power = true;
	}
	
	boolean power;
	int channel;
	
	void powerOnOf() {
		power = power ? false : true;
		
	}

	// return 가능?
//	int channelUp(int channel) {
//		return channel++;
//	}
//	
//	int channelDown(int channel) {
//		return channel--;
//	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	void printChannel() {
		System.out.println("현재 채널 : " + channel);
	}
	void prinPower() {
		System.out.println("전원상태값 : " + power);
	}
}
