package com.exam;

// 클래스 Shape 도형  // 부모클래스
//  필드 double area  // 도형의 면적
//  메소드 getArea() -> area값 구해서 리턴
class Shape {
	double area;
	
	double getArea() {
		return area;
	}
}

// 클래스 Circle 원 // 상속 Shape
//  필드 정수형 radius = 5  // 원의 반지름
//  메소드 오버라이딩 -> 원의면적 구해서 리턴
class Circle extends Shape {
	int radius = 5;

	@Override
	double getArea() {
		area = radius * radius * Math.PI;
		return area;
	}
}

//클래스 Rectangle 사각형 // 상속 Shape
// 필드 정수형 width = 10, height = 10 // 가로, 세로
// 메소드 오버라이딩 -> 사각형의면적 구해서 리턴
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
		// 정적 바인딩(컴파일 시점에 발생)
		Circle c = new Circle();
		System.out.println("원의면적: " + c.getArea());
		
		Rectangle r = new Rectangle();
		System.out.println("사각형 면적: " + r.getArea());
		
		Triangle t = new Triangle();
		System.out.println("삼각형 면적: " + t.getArea());
		
		System.out.println("===================");
		
		// 동적 바인딩(실행시간에 JVM에 의해서 발생.)
		//  -> 객체에 오버라이딩(재정의)된 메소드가 있는지 검사함.
		Shape s;
		s = new Circle(); // 업캐스팅
		System.out.println("면적: " + s.getArea());
		
		s = new Rectangle(); // 업캐스팅
		System.out.println("면적: " + s.getArea());

		s = new Triangle(); // 업캐스팅
		System.out.println("면적: " + s.getArea());
		
		System.out.println("=============");
		
		Shape[] shapeArr = new Shape[3];
		shapeArr[0] = new Circle();
		shapeArr[1] = new Rectangle();
		shapeArr[2] = new Triangle();
		
		for (Shape shape : shapeArr) {
			System.out.println("면적:" + shape.getArea());
		}
		
		System.out.println("================");
		
		//printShapeArea(new Circle());
		
		Ex1 ex1 = new Ex1();
		ex1.printShapeArea(new Circle());
		ex1.printShapeArea(new Rectangle());
		ex1.printShapeArea(new Triangle());
	} // main method
	
	public void printShapeArea(Shape shape) {
		
		if (shape instanceof Circle) { // 객체타입확인
			Circle c = (Circle) shape; // 다운캐스팅
			c.radius = 20;
			System.out.print("Circle 면적: ");
		} else if (shape instanceof Rectangle) {
			System.out.print("Rectangle 면적: ");
		} else if (shape instanceof Triangle) {
			System.out.print("Triangle 면적: ");
		} else if (shape instanceof Shape) {
			System.out.print("Shape 면적: ");
		}
		System.out.println(shape.getArea());
	}

} // class Ex1



