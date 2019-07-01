package com.exam;

public class Ex4 {
	public static void main(String[] args) {
		// 키 175cm -> 출력 1m 75cm
		// 1m == 100cm
		int h = 175;
		System.out.println("키 : " + h + "cm  ->  " 
				+ h/100 +"m "+ h % 100 + "cm");
		
		float pi = 3.141592f;
		// 소수점 셋째자리까지 반올림
		// math.round()
		// 소숫점 이하 첫째자리에서 반올림
		pi = Math.round(pi*1000) / 1000f;
	
		
		System.out.println(pi);
	}
}
