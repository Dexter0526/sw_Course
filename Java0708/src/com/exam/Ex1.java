package com.exam;

public class Ex1 {
	public static void main(String[] args) {
		int[] scores = {100, 90, 80, 70, 68};
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		// for-each
//		for(int score : scores) sum += score;
		
		avg = (double)sum / scores.length;
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		
		System.out.println("========================");
		int[] num = {79, 88, 91, 33, 100, 55, 95, 81, 75, 64};
		int evenCount = 0; // ¦������
		int oddCount = 0; // Ȧ������
		int evenSum = 0; // ¦����
		int oddSum = 0; // Ȧ����
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0) {
				evenSum += num[i];
				evenCount++;
			}else {
				oddSum += num[i];
				oddCount++;
			}
		}
		System.out.println("¦������ : " + evenCount);
		System.out.println("Ȧ������ : " + oddCount);
		System.out.println("¦���� : " + evenSum);
		System.out.println("Ȧ���� : " + oddSum);
		
	}
}
