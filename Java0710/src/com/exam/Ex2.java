package com.exam;

public class Ex2 {

	public static void methodA(int a) {
		
	}

	public static void methodB(int[] arr) {
		arr[0] = 11;
	}
	public static void main(String[] args) {
		int a = 10;
		methodA(a);
		
		int[] arr = {10, 20, 30};
		methodB(arr);	//0��° ��Ҹ� 11�� ����
		
		for(int num: arr) {
			System.out.print(num + " ");
		}
	}
}
