package com.exam;

public class Animal {
	// 필드(멤버변수)
	// 문자열 name
	// 정수형 age
	String name;
	int age;
	
	// 기본생성자
	// 동물이름은 강아지, 나이는 3살로 초기화
	public Animal() {
		name = "강아지";
		age = 3;
	}
	// name 받아서 초기화하는 생성자. age는 1살
	public Animal(String name) {
		this.name = name;
		age = 1;
	}
	// age 받아서 초기화하는 생성자. name은 강아지
	public Animal(int age) {
		this.age = age;
		name = "강아지";
	}
	
	// name과 age 받아서 초기화하는 생성자
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
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
	
	// setter, getter 메서드 만들기
	
	// 메서드 run() -> 출력 "age살 name이 뛴다"
	void run() {
		System.out.println(age + "살 " + name +"이(가) 뛴다");
	}
}
