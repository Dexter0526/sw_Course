package com.exam;

// *객체지향 언어에서 관계 2가지 : 상속관계, 포함관계

// 상속(Inheritance) : A객체 1개를 사용
// A는 B다 (A is a B) 관계일 때 상속관계 가능
// 중학생은 학생이다.(O) <-> 학생은 중학생이다.(X)
// 강아지는 동물이다.(O) <-> 동물은 강아지다.(X)
// 레이싱카는 자동차다.(O)
class RacingCar extends Car {
	
}

// 포함(Include) : A객체 B객체 따로 생성후 포함관계로 사용
// A는 B를 가진다 (A has a B) 관계일때 포함관계 가능
// 자동차는 엔진을 가진다.
class Engine {}

class Car {
	Engine engine = new Engine();
}





//클래스간의 상속

class Parent {
	void printParent() {
		System.out.println("Parent 클래스의 printParent() 메소드");
	}
}

class Child extends Parent {
	void printChild() {
		System.out.println("Child 클래스의 printChild() 메소드");
	}
}

class GrandChild extends Child {
	void printGrandChild() {
		System.out.println("GrandChild 클래스의 printGrandChild() 메소드");
	}
}


public class Ex1 {
	public static void main(String[] args) {
		
		// 손자(GrandChild)클래스에서는 손자,자식,부모메소드 호출
		GrandChild g = new GrandChild();
		g.printGrandChild();
		g.printChild();
		g.printParent();
		
		System.out.println("==================");
		
		
		// 자식클래스에서 자식,부모메소드 호출
		Child c = new Child();
		c.printParent();
		c.printChild();
		
		System.out.println("==================");
		
		
		Parent p = new Parent();
		p.printParent();
		
		
		
		
	} // main method

}
