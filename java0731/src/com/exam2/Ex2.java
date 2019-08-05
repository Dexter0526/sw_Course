package com.exam2;

// 추상클래스 Shape2D
//   추상메소드  void draw()
abstract class Shape2D extends Object {
	Shape2D() {
		super();
	}
	
	abstract void draw();
}
// 클래스 Cir  상속 Shape2D
//  메소드 오버라이딩 -> 출력 "원을 그린다."
class Cir extends Shape2D {
	Cir() {
		super();
	}
	
	@Override
	void draw() {
		System.out.println("원을 그린다.");
	}
}
// 클래스 Rec  상속 Shape2D
//  메소드 오버라이딩 -> 출력 "사각형을 그린다."
class Rec extends Shape2D {
	@Override
	void draw() {
		System.out.println("사각형을 그린다.");
	}
}
// 클래스 Tri  상속 Shape2D
//  메소드 오버라이딩 -> 출력 "삼각형을 그린다."
class Tri extends Shape2D {
	@Override
	void draw() {
		System.out.println("삼각형을 그린다.");
	}
}

public class Ex2 {

	public static void main(String[] args) {
		Shape2D s;
		
		s = new Cir();
		s.draw();
		
		s = new Rec();
		s.draw();
		
		s = new Tri();
		s.draw();
		
		
	} // main method

}
