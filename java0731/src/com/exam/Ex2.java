package com.exam;

// 상속에서 final 키워드

/*final*/ class Parent { // 클래스 상속 못하게 막아줌
	
	// 필드를 상수화할때는 주로 static final로 사용함!
	static final int PUPPY = 1; // 상수
	static final int CAT = 2;   // 상수
	
	/*final*/ int a = 10; // 필드값 변경못하게함. 상수화.
	
	/*final*/ void print() { // 메소드 오버라이딩 못하게 막음.
		System.out.println("Parent - print()");
	}
}

class Child extends Parent {
	@Override
	void print() {
		System.out.println("Child - print()");
	}
}



public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
