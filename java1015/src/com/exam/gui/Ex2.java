package com.exam.gui;


/*static*/ class A {
	private int num;
	
	// instance(객체단위) 내부클래스 정의
	public class B {

	}
}

/*static*/ class C {
	// static(클래스단위) 내부클래스 정의
	public static class D {

	}
}


public class Ex2 {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B(); // 바깥에서 접근하는 경우(잘사용안함)
		
		C c = new C();
		C.D d = new C.D(); // 바깥에서 접근하는 경우(중요)
//		A.B b = new A.B();
	}

}
