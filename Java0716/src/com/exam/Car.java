package com.exam;

public class Car {
	// 필드
	// 문자열 color
	String color = "white";
	// 문자열 gearType	"auto" "manual"
	String gearType = "auto";
	// 정수형 doorCount
	int doorCount = 4;
	
	
	// 초기값
	public Car() {
	}
	
	// color gearType 받아 초기화하는 생성자
	public Car(String color, String gearType) {
		this.color = color;
		this.gearType = gearType;
	}
	// 전부 초기화
	public Car(String color, String gearType, int doorCount) {
		this.color = color;
		this.gearType = gearType;
		this.doorCount = doorCount;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	public int getDoorCount() {
		return doorCount;
	}
	public void setDoorCount(int doorCount) {
		this.doorCount = doorCount;
	}
	// 색상 : 타입 : 문수 : 
	void printCar() {
		System.out.println("색상 : " + color + " 타입 : " + gearType + " 문수 : " + doorCount);
		
	}
}
