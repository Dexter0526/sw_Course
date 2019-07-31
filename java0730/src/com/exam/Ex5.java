package com.exam;


class A extends Object {
	A() {
		super();
		System.out.println("생성자A");
	}
}
class B extends A {
	B() {
		super();
		System.out.println("생성자B");
	}
}
class C extends B {
	C() {
		super();
		System.out.println("생성자C");
	}
	
	C(int num) {
		this();
	}
}

public class Ex5 {
	public static void main(String[] args) {
		C c = new C();
	} // main method

}
