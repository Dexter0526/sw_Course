package com.exam;

public class Ex5 {
	public static void main(String[] args) {
		// ���(���ǹ�, �ݺ���)
		// ���ǹ� if switch
		// �ݺ��� for while do~while
		
		// if(���ǽ�){
		// ������ ���϶� ����
		//	}
		
		int a = 7; 
		if(a < 0) {
			a = -a;
		}
		System.out.println("a = " + a);
		
		a = 6;
		
		if(a%2 == 0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
		
		a = 30;
		int b = 20;
		int min = 0;
		System.out.println("�ּҰ� : " + min);
		
		//if() {
		//
		//}else if() {
		//	
		//}else if() {
		//	
		//}else {
		//	
		//}
		
		a = -5;
		// ��� �� ����
		if(a > 0) {
			System.out.println("���");
		}else if(a == 0){
			System.out.println(a);
		}else {
			System.out.println("����");
		}
		
		int score = 55;
		// A : 90~100
		// B : 80~89
		// C : 70~79
		// D : 60~69
		// F : 0~59
		if(score >= 90) {
			System.out.println("������ A");
		}else if(score >= 80) {
			System.out.println("������ B");
		}else if(score >= 70) {
			System.out.println("������ C");
		}else if(score >= 60) {
			System.out.println("������ D");
		}else {
			System.out.println("������ F");
		}
		
		// A 90�� �̻�
		//		A+ 98~100
		//		A  94~97
		//		A- 90~93
		// B 80�� �̻�
		score = 95;
		String grade = "";
		if(score >= 90) {
			
		}
		
	}
}
