package com.exam;

import java.util.Scanner;

class Circle{
	private double x, y;
	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	void show() {
		System.out.println("(" + this.x + "," + this.y + ")" + this.radius);
	}
}

public class CircleManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c [] = new Circle[3];
		for(int i = 0; i < c.length; i++) {
			System.out.println("x, y, radius >>");
			double x = scanner.nextDouble();
			double y= scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		for(int i = 0; i < c.length; i++) c[i].show();;
		
		Circle temp = new Circle();
		temp = c[0];
		for(int i = 1; i < c.length; i++) {
			if(temp.getRadius() < c[i].getRadius()){
				temp = c[i];
			}
		}
		System.out.print("가장 면적이 큰 원은 : ");
		temp.show();
	
		scanner.close();
	}
}
