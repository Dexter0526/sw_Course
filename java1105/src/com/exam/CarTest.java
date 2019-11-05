package com.exam;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = new Car(); // 객체
		
		HyundaiEngine hyundaiEngine = new HyundaiEngine(); // 객체
		
		car.setEngine(hyundaiEngine); // 객체간의 의존관계 주입
		// 객체 조립기 역할
		car.accel();

	}

}
