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
		System.out.println("ÇÕ°è : " + sum);
		System.out.println("Æò±Õ : " + avg);
		
		System.out.println("========================");
		int[] num = {79, 88, 91, 33, 100, 55, 95, 81, 75, 64};
		int evenCount = 0; // Â¦¼ö°³¼ö
		int oddCount = 0; // È¦¼ö°³¼ö
		int evenSum = 0; // Â¦¼öÇÕ
		int oddSum = 0; // È¦¼öÇÕ
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0) {
				evenSum += num[i];
				evenCount++;
			}else {
				oddSum += num[i];
				oddCount++;
			}
		}
		System.out.println("Â¦¼ö°³¼ö : " + evenCount);
		System.out.println("È¦¼ö°³¼ö : " + oddCount);
		System.out.println("Â¦¼öÇÕ : " + evenSum);
		System.out.println("È¦¼öÇÕ : " + oddSum);
		
	}
}
