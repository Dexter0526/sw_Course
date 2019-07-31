package com.exam;

// 메소드 오버라이딩(Overriding) : 부모의 메소드 재정의

class Wolf {
	void speak() {
		System.out.println("아우우~~~~");
	}
}

class Puppy extends Wolf {
	// 메소드 오버라이딩(재정의)
	void speak() {
		System.out.println("멍멍~~!!");
	}
	
	void sound() {
		//speak(); // this.speak();
		super.speak();
	}
}


public class Ex3 {

	public static void main(String[] args) {
		Puppy puppy = new Puppy();
		//puppy.speak();
		puppy.sound();

	}

}
