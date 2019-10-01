package com.exam;

public class Ex5 {

	public static void main(String[] args) {
		// 멀리스레딩 적용방법 2가지
		//  1. Thread 클래스 이용
		// [2. Runnable 인터페이스 이용]
		
		// Thread는 일꾼, Runnable은 일거리(작업).
		
		// Runnable 인터페이스를 구현한 클래스를
		// 익명 클래스로 정의하고
		// 기본생성자로 객체생성해서
		// 매개변수에 전달
		
		// 추상메소드를 한개만 가진 인터페이스는
		// 람다표현이 가능
		
		Thread thread1 = new Thread(() -> {
				while(true)
					System.out.println("go");
			});
		
		
		Thread thread2 = new Thread(() -> {
			while(true)
				System.out.println("come");
		});
		
		
		thread1.start();
		thread2.start();
		

	} // main method

}
