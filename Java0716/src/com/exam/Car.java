package com.exam;

public class Car {
	// �ʵ�
	// ���ڿ� color
	String color = "white";
	// ���ڿ� gearType	"auto" "manual"
	String gearType = "auto";
	// ������ doorCount
	int doorCount = 4;
	
	
	// �ʱⰪ
	public Car() {
	}
	
	// color gearType �޾� �ʱ�ȭ�ϴ� ������
	public Car(String color, String gearType) {
		this.color = color;
		this.gearType = gearType;
	}
	// ���� �ʱ�ȭ
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
	// ���� : Ÿ�� : ���� : 
	void printCar() {
		System.out.println("���� : " + color + " Ÿ�� : " + gearType + " ���� : " + doorCount);
		
	}
}
