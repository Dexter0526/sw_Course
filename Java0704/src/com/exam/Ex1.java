package com.exam;

public class Ex1 {
	public static void main(String[] args) {
		// while �ݺ���
		/*
		�ʱ��;
		while(���ǽ�) {
			�ݺ������ҹ���;
			������;
		}
		*/
		
		// 1~10 ���
		int i = 1;
		while(i <= 10) {
			System.out.println("i = " + i);
			i++;
		}

		// break�� : ���� ����� �ݺ��� ����� ��������
		for(int j = 1; j <= 10; j++) {
			if (j == 8) continue;
			System.out.println("j = " + j);
		}
		
		// do-while�� : ù��° �ݺ��� ������ ����Ǵ�
		/*
		do {
			�ݺ������ҹ���;
		}while(���ǽ�);
		*/
		
		boolean isHomeworkFinished = true;
		i = 0;
		do {
			if(i == 3) break;
			System.out.println("����~!");
			i++;
		}while(isHomeworkFinished); 
		
	}
}
