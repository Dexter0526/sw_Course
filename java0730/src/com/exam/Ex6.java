package com.exam;

class Parent {
	void printParent() {
		System.out.println("printParent()");
	}
}

class Child extends Parent { // 상속
	void printChild() {
		System.out.println("printChild()");
	}
}

class Child2 extends Parent {
	void printChild2() {
		System.out.println("printChild2()");
	}
}

public class Ex6 {

	public static void main(String[] args) {
		// 기본자료형 형변환
		//   -> 숫자형끼리(호환관계) 형변환 가능!
		double d = 3; // int -> double 3.0 자동형변환
		System.out.println(d); // 3.0
		
		int a = (int) 3.14; // double -> int 수동형변환
		System.out.println(a); // 3
		
		// 참조변수(레퍼런스) 형변환
		//   -> 상속관계끼리(호환관계) 형변환 가능!
		
		Child c = new Child();
		c.printParent();
		c.printChild();
		
		System.out.println("==============");
		
		Parent p; // 부모타입 참조변수가 큰 타입이다.
		p = new Child(); // 부모타입(큼) = 자식타입(작음) 
		p.printParent();
//		p.printChild();
		
		System.out.println("==============");
		
		c = (Child) new Parent(); // 자식타입(작음) = 부모타입(큼)
		c.printParent();
		c.printChild();
		
		System.out.println("==================");
		
		Child c2 = new Child();
		c2.printParent();
		c2.printChild();
		
		Parent p2 = c2; // 부모타입 = 자식타입
		// 업캐스팅: 자동형변환 -> 다형성
		p2.printParent();
//		p2.printChild(); // 부모참조변수로는 자식멤버 접근못함!
		
		System.out.println("============");
		
		// 부모타입 = 자식타입
		Parent p3 = new Child(); // 업캐스팅
		p3.printParent();
		
		Child c3;
		c3 = (Child) p3; // 자식타입 = 부모타입
		// 다운캐스팅 : 수동(명시적)형변환
		c3.printChild();
		
	} // main method

}
