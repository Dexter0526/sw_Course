package com.exam;

class ObjectTest /*extends Object*/ {
	
}

public class Ex3 {

	public static void main(String[] args) {
		// Object : java.lang.Object
		//   최상위 클래스. 모든클래스는 Object 상속받음.
		//   클래스의 공통적인부분 정의. 부모클래스.
		//  모든 클래스는 extends Object 생략.
		ObjectTest ot = new ObjectTest();
		// 현재 객체의 런타임 클래스를 리턴함
		System.out.println(ot.getClass());
		
		// 현재 객체에 대한 문자열 표현을 리턴함.
		System.out.println(ot.toString());
		System.out.println(ot);
		
		
		int a = 10, b = 10;
		if (a == b) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		String str1 = "안녕";
		String str2 = "안녕";
		if (str1 == str2) { // 참조주소를 비교함
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if (str1.equals(str2)) { // 문자열 내용 비교함
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		String str3 = new String("안녕");
		String str4 = new String("안녕");
		if (str3 == str4) { // 참조주소를 비교함
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if (str3.equals(str4)) { // 문자열 내용 비교함
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		
		
		
		
	} // main method

}
