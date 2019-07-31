package com.exam;

public class Rectangle {
	int x, y, width, height;

	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	int square() {
		return width * height;
	}
	void show() {
		System.out.println("(" + x + ", " + y + ")에서 크기가 " + 
	+ width + "x" + height + "인 사각형");
	}
	
	boolean contains(Rectangle r) {
		boolean answer = false;
		if(r.x >= x && r.x+r.width <= width) {
			if(r.y >= y && (r.y + r.height) <= height) {
				answer = true;
			}
		}
		
		return answer;
	}
}
