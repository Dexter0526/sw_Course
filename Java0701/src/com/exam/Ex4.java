package com.exam;

public class Ex4 {
	public static void main(String[] args) {
		// Ű 175cm -> ��� 1m 75cm
		// 1m == 100cm
		int h = 175;
		System.out.println("Ű : " + h + "cm  ->  " 
				+ h/100 +"m "+ h % 100 + "cm");
		
		float pi = 3.141592f;
		// �Ҽ��� ��°�ڸ����� �ݿø�
		// math.round()
		// �Ҽ��� ���� ù°�ڸ����� �ݿø�
		pi = Math.round(pi*1000) / 1000f;
	
		
		System.out.println(pi);
	}
}
