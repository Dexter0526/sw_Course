package com.exam;


class Animal { // 동물
	void speak() {
		System.out.println("소리내기~~");
	}
}

class Dog extends Animal {
	@Override // 애노테이션(annotation)
	void speak() {
		System.out.println("멍멍~~~!");
	}
	
	void beFriendly() {
		System.out.println("사람이랑 친근하게 굴기");
	}
}

class Cat extends Animal {
	@Override
	void speak() {
		System.out.println("야옹~~!");
	}
}

class Duck extends Animal { // 오리
	@Override
	void speak() {
		System.out.println("꽥꽥~~!");
	}
}

class Vet { // 수의사
	/*
	void giveShot(Dog dog) { // 주사놓기 메소드
		dog.speak(); // 주사맞아서 아야!!
	}
	
	void giveShot(Cat cat) { // 주사놓기 메소드
		cat.speak(); // 주사맞아서 아야!!
	}
	
	void giveShot(Duck duck) { // 주사놓기 메소드
		duck.speak(); // 주사맞아서 아야!!
	}
	*/
	void giveShot(Animal animal) { // 주사놓기 메소드
		animal.speak(); // 주사맞아서 아야!!
	}
}



class HulkBuster {
	// Arm arm;
	
	void setArm(/* Arm arm */) {
		// this.arm = arm;
	}
}


public class Ex7 {

	public static void main(String[] args) {
		// 정적 바인딩이 일어나는 경우
		Cat cat = new Cat();
		cat.speak();
		
		System.out.println("=========");
		
		
		// 정적 바인딩
		Animal animal = new Animal();
		animal.speak();
		
		// 동적 바인딩(자식타입 객체를 부모타입 참조변수로 잡고 사용할때)
		animal = new Dog(); // 업캐스팅(부모타입 = 자식타입)
		animal.speak();
		Dog dog = (Dog) animal; // 다운캐스팅(자식타입 = (자식타입형변환)부모타입)
		dog.beFriendly();
		
		System.out.println("===========");
		
		animal = new Cat();
		animal.speak();
		
		System.out.println("========");
		
		Vet vet = new Vet();
		vet.giveShot(new Dog());
		vet.giveShot(new Cat());
		vet.giveShot(new Duck());
	} // main method

}
