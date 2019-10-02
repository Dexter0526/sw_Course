package com.exam;

public class Ex6 {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println(Thread.currentThread().getName()); // main 스레드
		System.out.println(Thread.currentThread().getPriority()); // 5
		
		System.out.println(Thread.MAX_PRIORITY); // 10
		System.out.println(Thread.NORM_PRIORITY); // 5
		System.out.println(Thread.MIN_PRIORITY); // 1
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
	} // main method

}
