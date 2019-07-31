package com.exam;

// super() 생성자 호출 :
// 부모클래스의 기본생성자가 아닌 다른 생성자를 
// 명시적으로 호출 가능하게 해줌.

class Point2D {
	int x;
	int y;
	
		
	Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void print() {
		System.out.print(x + ", " + y);
	}
}

class Point3D extends Point2D {
	int z;

	Point3D() {
		super(1, 2);
//		x = 1;
//		y = 2;
		z = 3;
	}
	
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	void print() {
		super.print();
		System.out.print(", " + z);
	}
	
}

public class Ex4 {

	public static void main(String[] args) {
		Point3D p1 = new Point3D();
		p1.print();
		System.out.println();
		
		Point3D p2 = new Point3D(10, 20, 30);
		p2.print();
	}

}
