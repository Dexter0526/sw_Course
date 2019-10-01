package com.exam;


class GoTask implements Runnable {
	@Override
	public void run() {
		go();
	}
	
	void go() {
		while(true)
			System.out.println("go");
	}
}

class ComeTask implements Runnable {

	@Override
	public void run() {
		come();
	}
	
	void come() {
		while(true)
			System.out.println("come");
	}
	
}

public class Ex3 {

	public static void main(String[] args) {
		// 멀리스레딩 적용방법 2가지
		//  1. Thread 클래스 이용
		// [2. Runnable 인터페이스 이용]
		
		// Thread는 일꾼, Runnable은 일거리 작업.
		
		Thread thread1 = new Thread(new GoTask());
		Thread thread2 = new Thread(new ComeTask());
		
		thread1.start();
		thread2.start();
		
	} // main method

}
