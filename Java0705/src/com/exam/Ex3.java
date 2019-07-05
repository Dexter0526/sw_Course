package com.exam;

public class Ex3 {
	public static void main(String[] args) {
		// 무한반복(무한루프)
//		for(;true;) {
		
//		}
//		for(;;) {
		
//		}
//		
//		while(true) {
		
//		}
		
		// (1) + (-2) + (3) + ....(-10) + ....
		// 총합이 100 이상이면 반복문 빠져나와서 총합 출력
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
