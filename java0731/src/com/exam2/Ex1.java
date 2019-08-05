package com.exam2;

// 추상클래스가 되는 경우
// 1) 클래스를 객체생성 못하게 만들때
// 2) 클래스 안에 추상메소드가 1개 이상 존재할때


abstract class Shape { // 추상클래스
	double area;
	
	abstract double getArea(); // 추상메소드
}

class Circle extends Shape {
	
	int radius = 5;

	@Override
	double getArea() {
		area = radius * radius * Math.PI;
		return area;
	}
	
}

class Rectangle extends Shape {
	int width = 10;
	int height = 10;
	
	@Override
	double getArea() {
		area = width * height;
		return area;
	}
}
//클래스 Triangle 삼각형 // 상속 Shape
// 필드 정수형 width = 10, height = 10 // 밑변, 높이
// 메소드 오버라이딩 -> 삼각형의면적 구해서 리턴
class Triangle extends Shape {
	int width = 10;
	int height = 10;
	
	@Override
	double getArea() {
		area = width * height / 2.0;
		return area;
	}
}

public class Ex1 {

	public static void main(String[] args) {
		Shape s = new Circle();
		s = new Rectangle();
		s = new Triangle();
		
		System.out.println(s.getArea());
	} // main method

} // class Ex1



