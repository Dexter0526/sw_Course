package com.exam;

public class Tv {
	// �ʵ�(�������)
	// ���� bool�� power
	// ä�� ������ channel
	// 

	// �޼ҵ�
	// ���� �Ѱ� ���� power on or off

	// ä��1���� channelUp()
	// ä��1�ٿ� channelDown()
	
	Tv(){
		System.out.println("Tv ������ ȣ���.");
		power = true;
	}
	
	boolean power;
	int channel;
	
	void powerOnOf() {
		power = power ? false : true;
		
	}

	// return ����?
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
		System.out.println("���� ä�� : " + channel);
	}
	void prinPower() {
		System.out.println("�������°� : " + power);
	}
}
