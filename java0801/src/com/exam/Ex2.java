package com.exam;

abstract class AbsTest1 {}

abstract class AbsTest2 {}

interface ITest1 {
	void iTest1Method();
}

interface ITest2 {
	void iTest2Method();
}

// 인터페이스간에 상속 가능. 다중상속 허용됨.
interface ITest3 extends ITest1, ITest2 {
	void iTest3Method();
}

class SubTest extends AbsTest1 implements ITest1 {
	@Override
	public void iTest1Method() {
	}
}

class SubTest2 implements ITest1, ITest2 {
	@Override
	public void iTest2Method() {
	}
	@Override
	public void iTest1Method() {
	}
}

class SubTest3 implements ITest3 {
	@Override
	public void iTest1Method() {
	}
	@Override
	public void iTest2Method() {
	}
	@Override
	public void iTest3Method() {
	}
}


public class Ex2 {
	public static void main(String[] args) {
		ITest3 it3 = new SubTest3();
		ITest1 it1 = it3; // 업캐스팅=다형성
		it1.iTest1Method();
		
		ITest1 it11 = new SubTest3();
		ITest3 it33 = (ITest3) it11; // 다운캐스팅
		it33.iTest1Method();
		it33.iTest2Method();
		it33.iTest3Method();
	}
}
