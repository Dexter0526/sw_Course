package com.exam;

abstract class Animal {
	abstract void speak();
	
	void sleep() {
		System.out.println("잠자기 쿨쿨..");
	}
}

class Dog extends Animal implements DetectionAgent {
	
	@Override
	void speak() {
		System.out.println("멍멍~~!!");
	}

	@Override
	public void detect() {
		System.out.println("킁킁~~ 강아지가 탐지하다");
	}
	
	void beFriendly() {
		System.out.println("친근하게 굴기~");
	}
}

interface DetectionAgent { // 탐지 요원
	/*public abstract*/ void detect();
}

class Person implements DetectionAgent {
	@Override
	public void detect() {
		System.out.println("탐지요원으로서 탐지하다");
	}
}


public class Ex1 {

	public static void main(String[] args) {
		Animal animal = new Dog(); // 업캐스팅:다형성
		animal.speak();

		Dog dog = (Dog) animal;  // 다운캐스팅
		dog.beFriendly();
		
		
		
		DetectionAgent agent = dog; // 업캐스팅:다형성
		agent.detect();
		
		agent = new Person();
		agent.detect();
		
		
		
	}

}
