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
		
		// 1번 학생 : 85 60 70 	총점 평균
		// 2번 학생 : 90 95 80
		// 3번 학생 : 75 80 100
		// 4번 학생 : 80 70 95
		// 5번 학생 : 100 65 80
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print((i+1) + "번 학생 : ");
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
