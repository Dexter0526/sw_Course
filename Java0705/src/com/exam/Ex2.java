package com.exam;

// ����
public class Ex2 {

	public static void main(String[] args) {
		int answer = 0;
		// ����1.
		// for��
		// (1) + (1+2) + (1+2+3) + ... + (1+2+3+..+10)
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				answer += j;
			}
			// �׽�Ʈ ���
			System.out.println(answer);
		}
		
		// ����2.
		// (1) + (-2) + (3) + (-4) + ....+ (-10)
		answer = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) answer += -i;
			else answer += i;
		}
		// �׽�Ʈ ���
		System.out.println(answer);
		
		// ����3.
		// �ΰ��� �ֻ����� �������� �������� 6�� �Ǵ�
		// 1 - 5
		// 2 - 4
		answer = 0;
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				answer = i + j;
				if(answer == 6) {
					//�׽�Ʈ ���
					System.out.println(i + " - " + j);
				}
			}
		}
		
		
		// ����4.
		// 2x + 4y = 10		0 <= x <= 10	0 <= y <= 10
		// x = 1, y = 2
		// x = 3, y = 1
		// x = 5, y = 0
		answer = 0;
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= 10; j++) {
				answer = 2*i + 4*j;
				if(answer == 10) {
					System.out.println("x = " + i + ", y = " + j);
				}
			}
		}
		
	}
	
}
