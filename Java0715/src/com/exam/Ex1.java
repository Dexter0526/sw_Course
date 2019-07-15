package com.exam;

public class Ex1 {
	public static void main(String[] args) {
		Point p = new Point();
		p.printData();
		Point p2 = new Point(300);
		p2.printData();
		Point p3 = new Point(300, 400);
		p3.printData();
		
		p.setX(300);
		p.setY(400);
		p.printData();
		
		
	}
}
