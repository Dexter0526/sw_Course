package com.exam;

public class Ex2 {

	public static void main(String[] args) {
		int channel = 0;
		// Ŭ���� ȣ��
		Tv tv = new Tv();
		tv.channel = channel;
		// onoff ȣ��
		tv.powerOnOf();
		// �������°� ��� power
		tv.prinPower();
		// �޼ҵ�ȣ��� ä�� 1����
		tv.channelUp();
		// �޼ҵ�ȣ��� ä�� 1����
		tv.channelUp();
		// ���� ä�ΰ� ���
		tv.printChannel();
		// �޼ҵ�ȣ��� ä�� 1����
		tv.channelDown();
		// �޼ҵ�ȣ��� ä�� 1����
		tv.channelUp();
		// �޼ҵ�ȣ��� ä�� 1����
		tv.channelDown();
		// ���� ä�ΰ� ���
		tv.printChannel();
		
		
		
	}
}
