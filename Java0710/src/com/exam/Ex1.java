package com.exam;

public class Ex1 {

	public static void printArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
	}
	public static int sumArr(int[] arr) {
		int answer = 0;
		for(int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// 1�����迭 ������ arr 10 20 30 40 50
		// �迭���� ��� �޼ҵ� ȣ�� -> ��� "10 20 30 40 50"
		// printArr(arr);
//		System.out.println("�迭�� �� : " + sumArr(arr));
//		System.out.println("�迭�� ��� : " + );
		
		int[] arr = {10,20,30,40,50};
		printArr(arr);
		System.out.println("�迭�� �� : " + sumArr(arr));
		System.out.println("�迭�� ��� : " + sumArr(arr)/arr.length);
	}
}
