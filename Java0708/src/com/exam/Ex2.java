package com.exam;

import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {
		int[] num = {79, 88, 91, 33, 100, 55, 95, 81, 75, 64};
		int max = 0;
		for(int i = 0; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		int min = 0;
		for(int i = 1; i < num.length; i++) {
			min = num[0];
			if(min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("max = " + max + ", min = " + min);
		
		System.out.println("=========================");
		
		for(int n : num) {
			System.out.println(n + " ");
		}System.out.println();
		
		int temp = 0;
		for(int i = 0; i < num.length; i++) {
			for(int j = i; j < num.length; j++) {
				if(num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
	}
}
