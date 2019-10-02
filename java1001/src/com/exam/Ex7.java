package com.exam;


class SharedData {
	// 두 스레드가 공유하는 데이터
	private int number;
	
	// numberUp()은 UpThread가 계속 호출하는 메소드
	public synchronized void numberUp(String name) {
		System.out.print(name + "이 " + number + "을 ");
		number++;
		System.out.println(number + "로 증가시킴.");
	}
	
	// numberDown()은 DownThread가 계속 호출하는 메소드
	public synchronized void numberDown(String name) {
		System.out.print(name + "이 " + number + "을 ");
		number--;
		System.out.println(number + "로 감소시킴.");
	}
} // class SharedData


class UpThread extends Thread {
	
	private SharedData sharedData;
	private String name;
	
	public UpThread(SharedData sharedData, String name) {
		super();
		this.sharedData = sharedData;
		this.name = name;
	}

	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			
			try {
				Thread.sleep(500); // 500밀리초=0.5초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			sharedData.numberUp(name);
		} // for
	}
} // class UpThread


class DownThread extends Thread {
	
	private SharedData sharedData;
	private String name;
	
	public DownThread(SharedData sharedData, String name) {
		super();
		this.sharedData = sharedData;
		this.name = name;
	}

	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			
			try {
				Thread.sleep(500); // 500밀리초=0.5초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			sharedData.numberDown(name);
		} // for
	}
} // class DownThread


public class Ex7 {

	public static void main(String[] args) {
		// 스레드 동기화(synchronization) <-> 비동기 async
		// 동기화: 어떤 스레드가 특정 코드블록 실행이 끝나면 다른 스레드가 동작하게 만듦
		// 접근지정자 synchronized 리턴타입 메소드명() {}
		
		SharedData sharedData = new SharedData();
		
		UpThread upThread = new UpThread(sharedData, "UP");
		DownThread downThread = new DownThread(sharedData, "DOWN");
		
		upThread.start();
		downThread.start();
		
	} // main method

}
