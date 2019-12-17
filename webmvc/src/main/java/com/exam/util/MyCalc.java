package com.exam.util;

public class MyCalc {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int[] array(int num) {
		int[] numArr = new int[num];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i+1;
		}
		
		return numArr;
	}
	
	public boolean isOdd(int num) {
		return num % 2 == 1;
	}
}
