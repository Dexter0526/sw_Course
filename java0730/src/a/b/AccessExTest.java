package a.b;

import a.AccessEx;

public class AccessExTest {

	public static void main(String[] args) {
		SubAccessEx sub = new SubAccessEx();
		sub.subPrintField();
		
		// 클래스가 상속관계가 아니므로 protected멤버 접근불가
//		System.out.println(sub.c); // protected
		System.out.println(sub.d); // public
		
		
		AccessEx acc = new AccessEx();
//		System.out.println(acc.a); // private
//		System.out.println(acc.b); // package(생략)
//		System.out.println(acc.c); // protected
		System.out.println(acc.d); // public
		
		acc.printField();
	}

}
