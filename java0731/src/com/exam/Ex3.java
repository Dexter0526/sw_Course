package com.exam;

// 인터페이스의 모든 접근지정자는 public
interface IHello {
	// static final 상수
	public static final int RED = 1;
	int BLUE = 2;
	
	// 메소드는 추상메소드만 가져야 함
	void sayHello();
	public abstract void sayGoodbye();
}

class MyHello implements IHello {//인터페이스 구현(일종의 상속)
	@Override
	public void sayHello() {
		System.out.println("안녕");
	}

	@Override
	public void sayGoodbye() {
		System.out.println("잘가");
	}
}


public class Ex3 {

	public static void main(String[] args) {
		System.out.println(IHello.RED);
		System.out.println(IHello.BLUE);
//		IHello.RED = 10;
//		IHello.BLUE = 20
		
		// 인터페이스로는 객체생성 못함
//		IHello hello = new IHello();
		
		// 인터페이스 타입 참조변수로
		// 인터페이스를 구현한 객체를 사용함.
		IHello iHello = new MyHello(); // 업캐스팅
		iHello.sayHello();
		iHello.sayGoodbye();
	}

}
