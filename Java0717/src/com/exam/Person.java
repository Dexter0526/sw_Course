package com.exam;

public class Person {
	// 필드
	// 문자열 name 은닉
	private String name;
	// 정수형 age 은닉
	private int age;
	// 기본생성자 이름 : "홍길동", 나이 : 22
	public Person() {
//		this("홍길동", 22);
		name = "홍길동";
		age = 22;
	}
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
	//set/get 메소드 전체공개	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
