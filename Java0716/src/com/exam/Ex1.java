package com.exam;

public class Ex1 {
	public static void main(String[] args) {
		MyDate m = new MyDate();
		m.setYear(2019);
		System.out.println(m.getYear());
		
		MyDate m2 = new MyDate(2019, 07, 16);
		m2.printDate();
		
		Car c1 = new Car();
		c1.printCar();
		
		Car c2 = new Car("red", "manual");
		c2.printCar();
		
	}
}
