package com.exam;

// Point2D 클래스
// 필드 정수형 x y
// 메소드 print2D  -> 출력 "x, y"
class Point2D {
	int x, y;
	void print2D() {
		System.out.print(x + ", " + y);
	}
}

// Point3D 클래스 상속 Point2D
// 필드 정수형 z
// 메소드 print3D  -> 출력 "x, y, z"
class Point3D extends Point2D {
	int z;
	void print3D() { 
		print2D();
		System.out.print(", " + z); 
		
//		System.out.println(x + ", " + y + ", " + z);
	}
}

public class Ex2 {
	public static void main(String[] args) {
		// Point3D 객체생성
		Point3D p = new Point3D();
		// x=10  y=20  z=30
		p.x = 10; p.y = 20; p.z = 30;
		// 메소드 호출  print2D()   print3D()
		p.print3D();
	} // main

}
