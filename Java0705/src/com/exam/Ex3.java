package com.exam;

public class Ex3 {
	public static void main(String[] args) {
		// ���ѹݺ�(���ѷ���)
//		for(;true;) {
		
//		}
//		for(;;) {
		
//		}
//		
//		while(true) {
		
//		}
		
		// (1) + (-2) + (3) + ....(-10) + ....
		// ������ 100 �̻��̸� �ݺ��� �������ͼ� ���� ���
		int i = 1;
		int sum = 0;
		while(true) {
			if(i % 2 == 0) {
				sum += -i;
			}else sum += i;
			i++;
			if(sum >= 100) {
				break;
			}
		}System.out.println(sum);
		
	}
}
