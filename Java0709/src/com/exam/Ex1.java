package com.exam;

public class Ex1 {
	public static void main(String[] args) {
		
		int[][] scores = {{85, 60, 70},
				{90, 95, 80}, 
				{75, 80, 100}, 
				{80, 70, 95}, 
				{100, 65, 80}};
		int sum = 0;
		double avg = 0;
		
		// 1�� �л� : 85 60 70 	���� ���
		// 2�� �л� : 90 95 80
		// 3�� �л� : 75 80 100
		// 4�� �л� : 80 70 95
		// 5�� �л� : 100 65 80
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print((i+1) + "�� �л� : ");
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + " ");
				sum += scores[i][j];
				avg = (double)sum / scores[i].length;
			}
			System.out.print(" " + sum + " " + Math.round(avg*100)/100.0);
			System.out.println();
			sum = 0;
		}
	}
}
