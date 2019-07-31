package com.exam;

// static이 붙으면 객체의 구성요소가 아님
class Tree{
	// 필드(멤버 변수)
	String name;
	int age;
	void wave() {
		System.out.println(age + "살" + name + "(이)가 바람에 흔들립니다.");
	}
}

public class Ex4 {

	public static void main(String[] args) {
		// 변수(한개 기억장소)
		// -> 배열(같은 자료형 기억장소 여러개)
		// -> 구조체(다른자료형 기억장소 여러개)
		// -> 클래스(구조체 + 함수)
		
		// 클래스 : 객체 정의(멤버변수 + 메소드)
		// 객체(인스턴스) : 생성(기억장소 확보, 초기화), 사용
		// 클래스		객체(인스턴스)
		// 제품설계도	제품
		// tv설계도	tv
		// 붕어빵기계	붕어빵
		
		int a;	// 변수선언
		a = 0;
		
		int[] arr; // 배열변수 선언
		arr = new int[5];
		
		Tree tree;
		tree = new Tree();
		
		System.out.println(tree.name);
		System.out.println(tree.age);
		
		tree.name = "소나무";
		tree.age = 100;
		System.out.println(tree.name);
		System.out.println(tree.age);
		tree.wave();
		
		Tree tree2 = new Tree();
		
		tree2.name = "대나무";
		tree2.age = 10;
		System.out.println(tree2.name);
		System.out.println(tree2.age);
		tree2.wave();
		
		
		
	}
}
